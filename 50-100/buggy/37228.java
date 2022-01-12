@java.lang.Override
protected boolean readyToProgress() {
    return (((this.externalNetworksFinishedStep.size()) == ((this.totalNumberNetworks) - 1)) && ((this.externalNetworksSendEvent.size()) == (getSimulationAgent().getConnectedNetworkIndices().size()))) && (this.agentIsReady);
}