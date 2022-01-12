public void removeNode(alien4cloud.model.topology.Topology topology, java.lang.String nodeName, alien4cloud.model.topology.NodeTemplate nodeTemplate) {
    alien4cloud.paas.wf.WorkflowsBuilderService.TopologyContext topologyContext = buildTopologyContext(topology);
    initWorkflows(topologyContext);
    for (alien4cloud.paas.wf.Workflow wf : topology.getWorkflows().values()) {
        alien4cloud.paas.wf.AbstractWorkflowBuilder builder = getWorkflowBuilder(wf);
        builder.removeNode(wf, nodeName);
        alien4cloud.paas.wf.util.WorkflowUtils.fillHostId(wf, topologyContext);
        workflowValidator.validate(topologyContext, wf);
    }
    debugWorkflow(topology);
}