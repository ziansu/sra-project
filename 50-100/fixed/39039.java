protected void doNextStep() {
    (stepSkipIterationCounter)++;
    clearCommunicationAgent();
    injectEvents();
    if (afterBootFinished) {
        this.afterBootFinished = false;
    }else {
        this.progressedToNextStep.clear();
        sendToAll(new interdependent.Messages.ProgressedToNextStepMessage(getSimulationAgent().getNetworkIndex()));
    }
}