private void checkScenarioComplete() {
    if (levelController.levelIsCompleted(circuitController.circuit)) {
        this.scenarioCompleted();
    }else
        if ((levelController.getScenario().getClass()) != (com.edulectronics.tinycircuit.Models.Scenarios.ImplementedScenarios.FreePlayScenario.class)) {
            giveNegativeFeedback();
        }
    
}