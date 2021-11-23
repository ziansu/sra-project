public void deployCheIfSuspended(io.fabric8.openshift.client.OpenShiftClient client, java.lang.String namespace) throws io.fabric8.che.starter.exception.RouteNotFoundException {
    final io.fabric8.openshift.client.dsl.ClientDeployableScalableResource<io.fabric8.openshift.api.model.DeploymentConfig, io.fabric8.openshift.api.model.DoneableDeploymentConfig> deploymentConfig = getDeploymentConfig(client, namespace);
    if (!(isDeploymentAvailable(client, namespace))) {
        deploymentConfig.scale(1, false);
        waitUntilDeploymentConfigIsAvailable(client, namespace);
        cheServerRouteChecker.waitUntilRouteIsAccessible(client, namespace, null);
        waitHAProxyConfigChange();
    }
}