public void addRecord(final java.lang.String hostname, final java.lang.String componentSignature, final java.lang.String operationSignature) {
    final kieker.analysisteetime.model.analysismodel.deployment.DeploymentContext deploymentContext = this.addDeploymentContext(hostname);
    final kieker.analysisteetime.model.analysismodel.deployment.DeployedComponent component = this.addDeployedComponent(deploymentContext, componentSignature);
    this.addDeployedOperation(component, operationSignature);
}