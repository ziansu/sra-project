@org.junit.Test
public void testValidNullStudentEmail() {
    try {
        student = new model.Student("Jacó Mario Souza", cpf, rg, date, null, address, phone1, phone2, "Milene Souza Medeiros", "Mário Souza Filho", 1);
        assertEquals("", student.getStudentEmail());
    } catch (exception.StudentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}