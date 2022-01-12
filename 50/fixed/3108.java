@com.thoughtworks.cruise.editpipelinewizard.Step(value = "Verify global error message <errorMessage> shows up")
public void verifyGlobalErrorMessageForPipelineShowsUp(java.lang.String errorMessage) throws java.lang.Exception {
    java.lang.String completeErrorMessage = scenarioState.expand(errorMessage);
    verifyGlobalErrorsContain(completeErrorMessage);
}