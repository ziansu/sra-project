private void checkScenarioComplete(boolean run) {
    if (levelController.levelIsCompleted(circuitController.circuit)) {
        scenarioCompleted();
    }else
        if (run && ((levelController.getScenario().getClass()) != (com.edulectronics.tinycircuit.Models.Scenarios.ImplementedScenarios.FreePlayScenario.class))) {
            giveNegativeFeedback();
        }
    
}