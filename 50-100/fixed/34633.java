@org.junit.Test
public void testData() throws com.itextpdf.text.DocumentException, java.io.IOException {
    java.io.File[] file = new java.io.File[]{ new java.io.File("test.txt") };
    Project.DataTester.test = Project.DataToArray.textToArray(file);
    emptyResult = (Project.DataTester.test.isEmpty()) ? false : true;
    barResult = ((Project.DataTester.test.size()) == 15) ? true : false;
    assertTrue(((emptyResult) && (barResult)));
}