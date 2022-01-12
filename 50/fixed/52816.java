protected void doNextIteration() {
    (stepSkipIterationCounter)++;
    clearCommunicationAgent();
    injectEvents();
    progressCommandReceiverToNextIteration();
}