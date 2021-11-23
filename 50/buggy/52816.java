protected void doNextIteration() {
    if ((stepSkipIterationCounter) == 0) {
        (stepSkipIterationCounter)++;
        clearCommunicationAgent();
        injectEvents();
        progressCommandReceiverToNextIteration();
    }
}