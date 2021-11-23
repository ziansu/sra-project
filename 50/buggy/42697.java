private boolean shouldRestartDriverBeforeEachScenario() {
    return systemConfiguration.getEnvironmentVariables().getPropertyAsBoolean(SerenityJBehaveSystemProperties.RESTART_BROWSER_EACH_SCENARIO.getName(), false);
}