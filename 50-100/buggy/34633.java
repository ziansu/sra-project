@org.junit.Test
public void testData() throws com.itextpdf.text.DocumentException, java.io.IOException {
    Project.DataTester.test = Project.DataToArray.textToArray("test.txt");
    emptyResult = (Project.DataTester.test.isEmpty()) ? false : true;
    barResult = ((Project.DataTester.test.size()) == 15) ? true : false;
    assertTrue(((emptyResult) && (barResult)));
}