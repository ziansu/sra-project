@org.testng.annotations.Test
public void testSave() throws java.lang.Exception {
    studentDao.save("Luca");
    java.lang.String newStudent = studentDao.getName(3);
    org.testng.Assert.assertEquals(newStudent, "Luca");
}