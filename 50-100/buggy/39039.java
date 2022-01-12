protected void doNextStep() {
    if ((stepSkipIterationCounter) == 0) {
        (stepSkipIterationCounter)++;
        clearCommunicationAgent();
        injectEvents();
        if (afterBootFinished) {
            this.afterBootFinished = false;
        }else {
            this.progressedToNextStep.clear();
            sendToAll(new interdependent.Messages.ProgressedToNextStepMessage(getSimulationAgent().getNetworkIndex()));
        }
        progressCommandReceiverToNextTimeStep();
    }
}