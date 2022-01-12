@org.junit.Test
public void missingType() throws java.lang.Exception {
    java.lang.String thrift = "" + (("struct Nope {\n" + "  1: required list<Undefined> nope\n") + "}");
    try {
        load(thrift);
        org.junit.Assert.fail();
    } catch (com.microsoft.thrifty.schema.LoadFailedException e) {
        com.microsoft.thrifty.schema.LoaderTest.assertHasError(e, "Failed to resolve type 'Undefined'");
    }
}