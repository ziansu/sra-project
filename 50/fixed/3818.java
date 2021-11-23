@java.lang.Override
public void agentFinishedActiveState() {
    if (!(getSimulationAgent().isConverged()))
        progressCommandReceiverToNextIteration();
    
}