@org.junit.Test
public void testExistsNoZipFull() throws java.lang.Exception {
    setFunctionFound(true);
    java.lang.Boolean result = lambdaDeployService.deployLambda(getDeployConfig(), null, UpdateModeValue.Full);
    calledGetFunction();
    calledCreateFunction(false);
    calledUpdateCode(false);
    calledUpdateConfiguration(false);
    assertFalse(result);
}