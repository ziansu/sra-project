private void updateResultsForAnyExternalFailures(net.thucydides.core.model.TestOutcome testOutcome, net.thucydides.core.model.TestOutcome scenarioOutcome) {
    if (rowResultsAreInconsistantWithOverallResult(testOutcome)) {
        testOutcome.getDataTable().getRows().get(0).updateResult(testOutcome.getResult());
        scenarioOutcome.addFailingExternalStep(new java.lang.AssertionError(testOutcome.getTestFailureMessage()));
    }
}