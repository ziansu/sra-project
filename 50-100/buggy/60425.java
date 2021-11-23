@org.junit.Test
public void testReplaceNotExistingFunction() throws java.lang.Exception {
    io.crate.operation.udf.UserDefinedFunctionsMetaData metaData = io.crate.operation.udf.UserDefinedFunctionService.putFunction(io.crate.operation.udf.UserDefinedFunctionsMetaData.of(same1), different, true);
    assertThat(metaData.functionsMetaData(), hasSize(2));
    assertThat(metaData.functionsMetaData(), containsInAnyOrder(same1, different));
}