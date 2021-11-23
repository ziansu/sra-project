@org.junit.Test
public void ProseData() throws com.itextpdf.text.DocumentException, java.io.IOException {
    java.io.File[] file = new java.io.File[]{ new java.io.File("Prose.txt") };
    Project.DataTester.ProseFile = Project.DataToArray.textToArray(file);
    emptyResult = (Project.DataTester.ProseFile.isEmpty()) ? false : true;
    barResult = ((Project.DataTester.ProseFile.size()) == 1) ? true : false;
    assertTrue(((emptyResult) && (barResult)));
}