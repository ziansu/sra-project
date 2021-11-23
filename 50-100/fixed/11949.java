public void addScenario(java.lang.String scenarioName, elevatorsimulation.Model.BuildingScenario buildingScenario) {
    if (!(scenarioExists(scenarioName))) {
        buildingScenarios.put(scenarioName, buildingScenario);
        scenarioEntries.add(buildingScenario.getScenarioEntryText().toString());
        return ;
    }
    try {
        throw new elevatorsimulation.Exceptions.ScenarioAlreadyExistsException();
    } catch (elevatorsimulation.Exceptions.ScenarioAlreadyExistsException e) {
        java.lang.System.out.println("Scenario Already Exists");
    }
}