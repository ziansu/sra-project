@org.junit.Test
public void testValidNullFatherName() {
    java.lang.String validFatherName = null;
    try {
        student = new model.Student("Jacó Mario Souza", cpf, rg, date, email, address, phone1, phone2, "Milene Souza Medeiros", validFatherName, 1);
        assertEquals("", student.getFatherName());
    } catch (exception.StudentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}