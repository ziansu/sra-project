@org.junit.Test
public void testGernerateImageFromText() {
    DataMatrix dm = new DataMatrix("CSUMB CSIT online program is top notch.");
    dm.generateImageFromText();
    dm.translateImageToText();
    dm.displayImageToConsole();
    dm.displayTextToConsole();
    DataMatrix dm2 = new DataMatrix();
    dm2.readText("CSUMB CSIT online program is top notch.");
    dm2.generateImageFromText();
    dm2.displayImageToConsole();
    dm2.displayTextToConsole();
}