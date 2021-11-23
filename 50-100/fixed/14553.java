@org.junit.Test
public void testRemoveDoesNotExist() throws java.lang.Exception {
    expectedException.expect(io.crate.exceptions.UserDefinedFunctionUnknownException.class);
    expectedException.expectMessage("Cannot resolve user defined function: 'different()'");
    io.crate.operation.udf.UserDefinedFunctionsMetaData metaData = io.crate.operation.udf.UserDefinedFunctionsMetaData.of(same1);
    removeFunction(metaData, different.name(), different.argumentTypes(), false);
}