@org.junit.Test
public void getStudentsBySex() {
    java.util.List<com.jimmy.domain.Student> result = studentRepository.findBySex("Male");
    java.lang.System.out.println(("getStudentsBySex():" + result));
}