public java.util.List<net.thucydides.core.model.Screenshot> getScreenshots() {
    java.util.List<net.thucydides.core.model.Screenshot> screenshots = new java.util.ArrayList<net.thucydides.core.model.Screenshot>();
    java.util.List<net.thucydides.core.model.TestStep> testStepsWithScreenshots = select(getFlattenedTestSteps(), having(on(net.thucydides.core.model.TestStep.class).needsScreenshots()));
    for (net.thucydides.core.model.TestStep currentStep : testStepsWithScreenshots) {
        screenshots.addAll(screenshotsIn(currentStep));
    }
    return com.google.common.collect.ImmutableList.copyOf(screenshots);
}