@org.junit.Test(expected = exception.StudentException.class)
public void testEmptyStudentName() throws exception.StudentException {
    java.lang.String validStudentName = "";
    student = new model.Student(validStudentName, cpf, rg, date, email, address, phone1, phone2, "Milene Souza Medeiros", "Mário Souza Filho", 1);
}