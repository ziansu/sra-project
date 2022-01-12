@org.junit.Test
public void RememberingRainData() throws com.itextpdf.text.DocumentException, java.io.IOException {
    Project.DataTester.RememberingRain = Project.DataToArray.textToArray("RememberingRain.txt");
    emptyResult = (Project.DataTester.RememberingRain.isEmpty()) ? false : true;
    barResult = ((Project.DataTester.RememberingRain.size()) == 15) ? true : false;
    assertTrue(((emptyResult) && (barResult)));
}