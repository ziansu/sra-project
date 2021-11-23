@java.lang.Override
public void scenario(gherkin.formatter.model.Scenario scenario) {
    logger.info("Got to scenario {} ", scenario.getName());
    this.scenario = scenario;
}