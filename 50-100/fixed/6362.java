private void assertFileHasContent(java.lang.String fileName, java.lang.String expectedContent) throws java.io.IOException {
    java.io.File testFile = new java.io.File(fileName);
    try (java.io.FileReader reader = new java.io.FileReader(testFile);java.io.BufferedReader br = new java.io.BufferedReader(reader)) {
        java.lang.String content = br.readLine();
        junit.framework.Assert.assertEquals((("File " + fileName) + " does not contain expected content:"), expectedContent, content);
    }
}