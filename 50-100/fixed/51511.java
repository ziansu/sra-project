public io.subutai.core.environment.impl.workflow.modification.EnvironmentModifyWorkflow.EnvironmentGrowingPhase SETUP_VNI() {
    operationTracker.addLog("Setting up VNI");
    try {
        new io.subutai.core.environment.impl.workflow.modification.steps.VNISetupStep(topology, environment, peerManager, operationTracker).execute();
        environment = environmentManager.update(environment);
        return io.subutai.core.environment.impl.workflow.modification.EnvironmentModifyWorkflow.EnvironmentGrowingPhase.SETUP_P2P;
    } catch (java.lang.Exception e) {
        fail(e.getMessage(), e);
        return null;
    }
}