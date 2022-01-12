@org.junit.Test
public void testValidStudentBirthdate() {
    try {
        student = new model.Student("Jacó Mario Souza", cpf, rg, date, email, address, phone1, phone2, "Milene Souza Medeiros", "Mário Souza Filho");
        assertEquals(date, student.getBirthdate());
    } catch (exception.StudentException e) {
        fail(("Should not throw this exception: " + (e.getMessage())));
    }
}