@org.junit.Test
public void testValidEmptyStudentEmail() {
    try {
        student = new model.Student("Jacó Mario Souza", cpf, rg, date, "", address, phone1, phone2, "Milene Souza Medeiros", "Mário Souza Filho", 1);
        assertEquals("", student.getStudentEmail());
    } catch (exception.StudentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}