private boolean errorOrFailureRecordedForStep(java.lang.String stepTitle, java.lang.Throwable cause) {
    if (!(latestTestOutcome().isPresent())) {
        return false;
    }
    for (net.serenitybdd.jbehave.TestStep step : latestTestOutcome().get().getFlattenedTestSteps()) {
        if (((step.getException()) != null) && ((step.getException().getOriginalCause()) == cause)) {
            return true;
        }
    }
    return false;
}