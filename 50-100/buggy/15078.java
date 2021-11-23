@org.junit.Test(expected = java.lang.IndexOutOfBoundsException.class)
public void IncompleteBarData() throws com.itextpdf.text.DocumentException, java.io.IOException {
    Project.DataTester.IncompleteBar = Project.DataToArray.textToArray("IncompleteBar.txt");
    emptyResult = (Project.DataTester.IncompleteBar.isEmpty()) ? false : true;
    barResult = ((Project.DataTester.IncompleteBar.size()) == 0) ? true : false;
    assertTrue(((emptyResult) && (barResult)));
}