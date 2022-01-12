@java.lang.Override
protected boolean readyToProgress() {
    return (((this.externalNetworksFinishedStep.size()) == ((this.totalNumberNetworks) - 1)) && ((this.externalNetworksSendEvent.size()) == (java.lang.Integer.min(getSimulationAgent().getConnectedNetworkIndices().size(), ((this.totalNumberNetworks) - 1))))) && (this.agentIsReady);
}