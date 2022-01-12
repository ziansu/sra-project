@org.junit.Test
public void testReplaceIsFalse() throws java.lang.Exception {
    expectedException.expect(io.crate.exceptions.UserDefinedFunctionAlreadyExistsException.class);
    expectedException.expectMessage("User defined Function 'same()' already exists.");
    putFunction(io.crate.operation.udf.UserDefinedFunctionsMetaData.of(same1), same2, false);
}