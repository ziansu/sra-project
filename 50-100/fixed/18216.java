@org.junit.Test
public void testReadEmpty() {
    java.io.File file;
    java.lang.String filename = "";
    try {
        file = java.io.File.createTempFile("junit", ".csv");
        filename = file.getPath();
        new org.thegalactic.context.Context(filename);
        file.delete();
        org.junit.Assert.fail();
    } catch (java.io.IOException e) {
        org.junit.Assert.assertEquals(e.toString(), "java.io.IOException: CSV cannot be empty");
        new java.io.File(filename).delete();
    }
}