protected void stopManagedResources() {
    stopManagedResourceFlowElements(this.flowConfiguration.getManagedResourceFlowElements());
    stopManagedResourceFlowElements(this.exclusionFlowConfiguration.getManagedResourceFlowElements());
}