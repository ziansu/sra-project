@cucumber.api.java.After
public void teardown(final cucumber.api.Scenario scenario) {
    if (!(featureState.getFailed())) {
        au.com.agic.apptesting.steps.StepEventHandling.SCREENSHOT_UTILS.takeScreenshot((" " + (scenario.getName())), featureState);
    }
    featureState.setFailed(scenario.isFailed());
    final boolean clearDriver = java.lang.Boolean.parseBoolean(au.com.agic.apptesting.steps.StepEventHandling.SYSTEM_PROPERTY_UTILS.getProperty(Constants.NEW_BROWSER_PER_SCENARIO));
    synchronized(au.com.agic.apptesting.State.THREAD_DESIRED_CAPABILITY_MAP) {
        if (clearDriver) {
            State.THREAD_DESIRED_CAPABILITY_MAP.clearWebDriverForThread(true);
        }
    }
}