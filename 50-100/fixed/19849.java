@org.junit.Test
public void EmptyFileData() throws com.itextpdf.text.DocumentException, java.io.IOException {
    java.io.File[] file = new java.io.File[]{ new java.io.File("EmptyFile.txt") };
    Project.DataTester.EmptyFile = Project.DataToArray.textToArray(file);
    emptyResult = (Project.DataTester.EmptyFile.isEmpty()) ? true : false;
    barResult = ((Project.DataTester.EmptyFile.size()) == 0) ? true : false;
    assertTrue(((emptyResult) && (barResult)));
}