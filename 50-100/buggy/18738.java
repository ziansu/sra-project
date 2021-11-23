@org.testng.annotations.Test
public void packageResultsTest() throws java.io.IOException {
    java.lang.System.setProperty("packageResults", "true");
    outputFile.finalizeOutputFile();
    org.testng.Assert.assertTrue(new java.io.File(directory, ((file.getName()) + "_RESULTS.zip")).exists());
}