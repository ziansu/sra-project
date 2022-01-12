@org.junit.Test
public void circularTypedefs() throws java.lang.Exception {
    java.lang.String thrift = "" + ("typedef A B\n" + "typedef B A");
    try {
        load(thrift);
        org.junit.Assert.fail("Circular typedefs should fail to link");
    } catch (com.microsoft.thrifty.schema.LoadFailedException e) {
        com.microsoft.thrifty.schema.LoaderTest.assertHasError(e, "Unresolvable typedef");
    }
}