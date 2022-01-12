@org.junit.Test(expected = exception.StudentException.class)
public void testInvalidONStudentEmail() throws exception.StudentException {
    java.lang.String invalidEmail = "21342345";
    student = new model.Student("Jacó Mario Souza", cpf, rg, date, invalidEmail, address, phone1, phone2, "Milene Souza Medeiros", "Mário Souza Filho", 1);
}