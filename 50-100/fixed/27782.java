private void compareFiles(java.io.File inputFile, java.io.File outputFile) throws java.io.IOException {
    org.junit.Assert.assertTrue(outputFile.exists());
    byte[] inputFileContent = org.apache.commons.io.FileUtils.readFileToByteArray(inputFile);
    byte[] outputFileContent = org.apache.commons.io.FileUtils.readFileToByteArray(outputFile);
    org.junit.Assert.assertArrayEquals(inputFileContent, outputFileContent);
}