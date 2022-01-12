@org.junit.Test
public void testRemoveFunction() throws java.lang.Exception {
    io.crate.operation.udf.UserDefinedFunctionsMetaData metaData = io.crate.operation.udf.UserDefinedFunctionsMetaData.of(same1);
    io.crate.operation.udf.UserDefinedFunctionsMetaData newMetaData = io.crate.operation.udf.UserDefinedFunctionService.removeFunction(metaData, same1.name(), same1.argumentTypes(), false);
    assertThat(metaData, not(is(newMetaData)));
    assertThat(newMetaData.functionsMetaData().size(), is(0));
}