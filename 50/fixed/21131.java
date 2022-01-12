@org.junit.Test(expected = exception.StudentException.class)
public void testInvalidStudentCPF() throws exception.StudentException {
    student = new model.Student("Jacó Mario Souza", null, rg, date, email, address, phone1, phone2, "Milene Souza Medeiros", "Mário Souza Filho", 1);
}