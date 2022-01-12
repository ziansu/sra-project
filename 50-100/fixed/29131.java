@org.junit.Test
public void testValidMotherName() {
    java.lang.String validMotherName = "Milene Souza Medeiros";
    try {
        student = new model.Student("Jacó Mario Souza", cpf, rg, date, email, address, phone1, phone2, validMotherName, "Mário Souza Filho", 1);
        assertEquals(validMotherName, student.getMotherName());
    } catch (exception.StudentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}