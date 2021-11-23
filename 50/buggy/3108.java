@com.thoughtworks.cruise.editpipelinewizard.Step(value = "Verify global error message <errorMessage> for pipeline <pipelineName> shows up")
public void verifyGlobalErrorMessageForPipelineShowsUp(java.lang.String errorMessage, java.lang.String pipelineName) throws java.lang.Exception {
    java.lang.String completeErrorMessage = errorMessage + (scenarioState.expand(pipelineName));
    verifyGlobalErrorsContain(completeErrorMessage);
}