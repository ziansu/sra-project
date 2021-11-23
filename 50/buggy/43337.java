@java.lang.Override
public void startOfScenarioLifeCycle(gherkin.formatter.model.Scenario scenario) {
    logger.info("Got to scenario {} life cycle start", scenario.getName());
}