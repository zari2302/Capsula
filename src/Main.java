public class Main {
    public static void main(String[] args) {
        Curs curs= new Curs();
        curs.setName("It kg");
        curs.setNumber("java 2");
        curs.setTheTeachersName("Muratov Azamat");
        curs.setStartDate("1.02.2023");

        Student student= new Student();
        student.setName("Zarina");
        student.setBirthday("23.02.1993");
        student.setSurName("Kalmatova");
        student.setAge(30);
        System.out.println(curs.getName()+"\n"+curs.getNumber()+"\n"+curs.getTheTeachersName()+
                "\n"+curs.getStartDate());
        System.out.println(student.getName()+"\n"+student.getSurName()+"\n"
                +student.getBirthday()+"\n"+student.getAge());
    }
}