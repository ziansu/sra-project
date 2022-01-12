@org.junit.Test
public void RememberingRainData() throws com.itextpdf.text.DocumentException, java.io.IOException {
    java.io.File[] file = new java.io.File[]{ new java.io.File("RememberingRain.txt") };
    Project.DataTester.RememberingRain = Project.DataToArray.textToArray(file);
    emptyResult = (Project.DataTester.RememberingRain.isEmpty()) ? false : true;
    barResult = ((Project.DataTester.RememberingRain.size()) == 15) ? true : false;
    assertTrue(((emptyResult) && (barResult)));
}