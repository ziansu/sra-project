protected void startManagedResources() {
    java.util.List<org.ikasan.flow.visitorPattern.FlowElement<org.ikasan.spec.management.ManagedResource>> exclusionFlowElements = this.exclusionFlowConfiguration.getManagedResourceFlowElements();
    startManagedResourceFlowElements(exclusionFlowElements);
    java.util.List<org.ikasan.flow.visitorPattern.FlowElement<org.ikasan.spec.management.ManagedResource>> flowElements = this.flowConfiguration.getManagedResourceFlowElements();
    this.recoveryManager.setManagedResources(flowElements);
    startManagedResourceFlowElements(flowElements);
}