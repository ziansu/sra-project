private boolean driverIsDisabled() {
    return net.thucydides.core.steps.StepEventBus.getEventBus().webdriverCallsAreSuspended();
}