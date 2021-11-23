@org.junit.Test
public void testValidStudentAddress() {
    try {
        student = new model.Student("Jacó Mario Souza", cpf, rg, date, email, address, phone1, phone2, "Milene Souza Medeiros", "Mário Souza Filho");
        assertEquals(address, student.getAddress());
    } catch (exception.StudentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}