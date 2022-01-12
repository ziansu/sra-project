public void processGetInput(alien4cloud.model.application.DeploymentSetup deploymentSetup, alien4cloud.model.topology.Topology topology) {
    for (alien4cloud.model.topology.NodeTemplate nodeTemplate : topology.getNodeTemplates().values()) {
        processGetInput(deploymentSetup.getInputProperties(), nodeTemplate.getProperties());
        for (alien4cloud.model.topology.RelationshipTemplate relationshipTemplate : nodeTemplate.getRelationships().values()) {
            processGetInput(deploymentSetup.getInputProperties(), relationshipTemplate.getProperties());
        }
    }
}