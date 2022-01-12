@java.lang.Override
public void undeploy(alien4cloud.paas.model.PaaSDeploymentContext deploymentContext, alien4cloud.paas.IPaaSCallback callback) {
    alien4cloud.brooklyn.BrooklynProvider.log.info(((("UNDEPLOY " + deploymentContext) + " / ") + callback));
    javax.ws.rs.core.Response result = getNewBrooklynApi().getEntityApi().expunge(deploymentContext.getDeployment().getOrchestratorDeploymentId(), deploymentContext.getDeployment().getOrchestratorDeploymentId(), true);
    validate(result);
}