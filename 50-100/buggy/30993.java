@org.junit.Test
public void ProseData() throws com.itextpdf.text.DocumentException, java.io.IOException {
    Project.DataTester.ProseFile = Project.DataToArray.textToArray("Prose.txt");
    emptyResult = (Project.DataTester.ProseFile.isEmpty()) ? false : true;
    barResult = ((Project.DataTester.ProseFile.size()) == 1) ? true : false;
    assertTrue(((emptyResult) && (barResult)));
}