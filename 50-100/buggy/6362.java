private void assertFileHasContent(java.lang.String fileName, java.lang.String expectedContent) throws java.io.IOException {
    java.io.File testFile = new java.io.File(fileName);
    java.io.FileReader reader = new java.io.FileReader(testFile);
    java.io.BufferedReader br = new java.io.BufferedReader(reader);
    java.lang.String content = br.readLine();
    br.close();
    reader.close();
    junit.framework.Assert.assertEquals((("File " + fileName) + " does not contain expected content:"), expectedContent, content);
}