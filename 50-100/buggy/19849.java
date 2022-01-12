@org.junit.Test
public void EmptyFileData() throws com.itextpdf.text.DocumentException, java.io.IOException {
    Project.DataTester.EmptyFile = Project.DataToArray.textToArray("EmptyFile.txt");
    emptyResult = (Project.DataTester.EmptyFile.isEmpty()) ? true : false;
    barResult = ((Project.DataTester.EmptyFile.size()) == 0) ? true : false;
    assertTrue(((emptyResult) && (barResult)));
}