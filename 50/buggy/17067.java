public void testFinished(net.thucydides.core.steps.TestOutcome result) {
    if (getBaseStepListener().getTestOutcomes().isEmpty()) {
        return ;
    }
    for (net.thucydides.core.steps.StepListener stepListener : getAllListeners()) {
        stepListener.testFinished(result);
    }
    clear();
}