@org.testng.annotations.Test
public void packageResultsTest() throws java.io.IOException {
    java.lang.System.setProperty("packageResults", "true");
    outputFile.finalizeOutputFile();
    java.io.File results = new java.io.File(directory, ((file.getName()) + "_RESULTS.zip"));
    org.testng.Assert.assertTrue(results.exists());
    results.delete();
}