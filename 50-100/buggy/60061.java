@org.testng.annotations.Test(dataProvider = "files")
public void testEmptyTag(java.lang.String inputResource, java.lang.String expectedResource) throws java.lang.Exception {
    final java.io.File actualFile = java.io.File.createTempFile("test1.", "xml");
    final java.lang.String input = this.readResource(inputResource);
    this.consolidateTags(input, actualFile);
    final java.lang.String actual = this.readResource(actualFile);
    final java.lang.String expected = this.readResource(expectedResource);
    org.testng.Assert.assertEquals(actual.trim().replaceAll("(?s)\\r\\n?", "\\n"), expected.trim());
    actualFile.delete();
}