public void initModel() {
    if (deleteCurrent) {
        execution = null;
    }else {
        execution = readExecution();
    }
    updateIndex();
    generateUid();
    addMachineToExecution();
    if (jsystem.framework.JSystemProperties.getInstance().isExecutedFromIDE()) {
        currentScenario = new il.co.topq.difido.model.execution.ScenarioNode("default");
        execution.getLastMachine().addChild(currentScenario);
    }else {
        currentScenario = null;
    }
    currentTest = null;
}