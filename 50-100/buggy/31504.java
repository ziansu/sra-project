@org.junit.Test
public void circularTypedefs() throws java.lang.Exception {
    java.lang.String thrift = "" + ("typedef A B\n" + "typedef B A");
    java.io.File f = tempDir.newFile();
    com.microsoft.thrifty.schema.LoaderTest.writeTo(f, thrift);
    com.microsoft.thrifty.schema.Loader loader = new com.microsoft.thrifty.schema.Loader();
    loader.addThriftFile(f.getAbsolutePath());
    try {
        loader.load();
        org.junit.Assert.fail("Circular typedefs should fail to link");
    } catch (com.microsoft.thrifty.schema.LoadFailedException e) {
        com.microsoft.thrifty.schema.LoaderTest.assertHasError(e, "Unresolvable typedef");
    }
}