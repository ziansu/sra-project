@org.junit.Test(expected = exception.StudentException.class)
public void testNullStudentName() throws exception.StudentException {
    java.lang.String validStudentName = null;
    student = new model.Student(validStudentName, cpf, rg, date, email, address, phone1, phone2, "Milene Souza Medeiros", "Mário Souza Filho", 1);
}