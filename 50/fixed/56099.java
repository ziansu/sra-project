@org.junit.Test
public void testRemoveIfExistsEmptyMetaData() throws java.lang.Exception {
    io.crate.operation.udf.UserDefinedFunctionsMetaData newMetaData = removeFunction(null, same1.name(), same1.argumentTypes(), true);
    assertThat(newMetaData, is(notNullValue()));
}