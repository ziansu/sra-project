public void testFinished(net.thucydides.core.steps.TestOutcome result) {
    for (net.thucydides.core.steps.StepListener stepListener : getAllListeners()) {
        stepListener.testFinished(result);
    }
    clear();
}