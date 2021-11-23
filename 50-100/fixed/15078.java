@org.junit.Test(expected = java.lang.IndexOutOfBoundsException.class)
public void IncompleteBarData() throws com.itextpdf.text.DocumentException, java.io.IOException {
    java.io.File[] file = new java.io.File[]{ new java.io.File("IncompleteBar.txt") };
    Project.DataTester.IncompleteBar = Project.DataToArray.textToArray(file);
    emptyResult = (Project.DataTester.IncompleteBar.isEmpty()) ? false : true;
    barResult = ((Project.DataTester.IncompleteBar.size()) == 0) ? true : false;
    assertTrue(((emptyResult) && (barResult)));
}