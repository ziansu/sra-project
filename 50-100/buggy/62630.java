@org.junit.Test
public void missingType() throws java.lang.Exception {
    java.lang.String thrift = "" + (("struct Nope {\n" + "  1: required list<Undefined> nope\n") + "}");
    java.io.File f = tempDir.newFile();
    com.microsoft.thrifty.schema.LoaderTest.writeTo(f, thrift);
    com.microsoft.thrifty.schema.Loader loader = new com.microsoft.thrifty.schema.Loader();
    loader.addThriftFile(f.getAbsolutePath());
    try {
        loader.load();
        org.junit.Assert.fail();
    } catch (com.microsoft.thrifty.schema.LoadFailedException e) {
        com.microsoft.thrifty.schema.LoaderTest.assertHasError(e, "Failed to resolve type 'Undefined'");
    }
}