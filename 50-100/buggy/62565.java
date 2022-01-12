private static void generateImageFromTextSmokeTest() {
    java.lang.System.out.println("BEGIN TRANSLATE IMAGE FROM TEXT SMOKE TEST");
    final java.lang.String testString = "This is just a test";
    final com.northvine.reader.implementation.DataMatrix dataMatrix = new com.northvine.reader.implementation.DataMatrix(testString);
    java.lang.System.out.println("Generating Image From Text");
    dataMatrix.generateImageFromText();
    java.lang.System.out.println("Displaying Image to Console");
    dataMatrix.displayImageToConsole();
    java.lang.System.out.print("Converting Back To Text");
    dataMatrix.translateImageToText();
    dataMatrix.displayTextToConsole();
    java.lang.System.out.println("END TRANSLATE IMAGE FROM TEXT SMOKE TEST");
}