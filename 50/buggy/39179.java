@org.junit.Test
public void testSingleLetterFoundMultipleTimes() {
    com.github.hi_fi.remotesikulilibrary.utils.Helper.enableDebug();
    com.github.hi_fi.remotesikulilibrary.OCR.TextRecognizer tr = new com.github.hi_fi.remotesikulilibrary.OCR.TextRecognizer();
    java.util.List<org.sikuli.script.Location> results = tr.findTextFromImage("o", "src/test/resources/testImages/focus_test_app.png");
    assertEquals(5, results.size());
}