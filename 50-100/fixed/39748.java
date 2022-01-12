@org.junit.Test
public void testValidStudentName() {
    java.lang.String validStudentName = "Jacó Mario Souza";
    try {
        student = new model.Student(validStudentName, cpf, rg, date, email, address, phone1, phone2, "Milene Souza Medeiros", "Mário Souza Filho", 1);
        assertEquals(validStudentName, student.getStudentName());
    } catch (exception.StudentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}