@org.junit.Test
public void testValidNullStudentPhone2() {
    try {
        student = new model.Student("Jacó Mario Souza", cpf, rg, date, email, address, phone1, null, "Milene Souza Medeiros", "Mário Souza Filho");
        assertEquals(null, student.getSecondaryPhone());
    } catch (exception.StudentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}