@org.hlib4j.io.Test
public void testAddUriAndCompareToString() throws java.io.IOException {
    java.io.File ref = new java.io.File("/foobar");
    java.io.File add_file = workspace.addFileByURI(new java.io.File((((workspace) + (java.io.File.separator)) + "foobar")).toURI());
    org.hlib4j.io.Assert.assertEquals(ref.toURI(), add_file.toURI());
}