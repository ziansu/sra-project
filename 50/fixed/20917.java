@org.junit.Test(expected = exception.StudentException.class)
public void testInvalidStudentBirthdate() throws exception.StudentException {
    student = new model.Student("Jacó Mario Souza", cpf, rg, null, email, address, phone1, phone2, "Milene Souza Medeiros", "Mário Souza Filho", 1);
}