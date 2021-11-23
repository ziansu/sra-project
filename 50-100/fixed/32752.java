@org.testng.annotations.Test(dataProvider = "files")
public void testCopy(java.lang.String inputResource) throws java.lang.Exception {
    final java.io.File actualFile = java.io.File.createTempFile("test1.", "xml");
    final java.lang.String input = this.readResource(inputResource);
    this.copy(input, actualFile);
    final java.lang.String actual = this.readResource(actualFile);
    final java.lang.String expected = this.readResource(inputResource);
    org.testng.Assert.assertEquals(actual.trim().replaceAll("(?s)\\r\\n?", "\n"), expected.trim());
    actualFile.delete();
}