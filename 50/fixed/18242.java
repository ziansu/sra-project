@org.junit.Test(expected = exception.StudentException.class)
public void testInvalidStudentAddress() throws exception.StudentException {
    student = new model.Student("Jacó Mario Souza", cpf, rg, date, email, null, phone1, phone2, "Milene Souza Medeiros", "Mário Souza Filho", 1);
}