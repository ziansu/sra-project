@org.junit.Test
public void testReplaceExistingFunction() throws java.lang.Exception {
    io.crate.operation.udf.UserDefinedFunctionsMetaData metaData = putFunction(io.crate.operation.udf.UserDefinedFunctionsMetaData.of(same1), same2, true);
    assertThat(metaData.functionsMetaData(), hasSize(1));
    assertThat(metaData.functionsMetaData(), contains(same2));
}