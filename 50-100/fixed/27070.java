private Deployer.DeploymentRequest getDeploymentRequest(java.util.Map<java.lang.String, java.util.Set<java.lang.String>> requirements, java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.apache.karaf.features.internal.service.RequestedState>> stateChanges, java.util.EnumSet<org.apache.karaf.features.internal.service.Option> options) {
    org.apache.karaf.features.internal.service.Deployer.DeploymentRequest request = new org.apache.karaf.features.internal.service.Deployer.DeploymentRequest();
    request.bundleUpdateRange = bundleUpdateRange;
    request.featureResolutionRange = featureResolutionRange;
    request.globalRepository = globalRepository;
    request.overrides = org.apache.karaf.features.internal.service.Overrides.loadOverrides(overrides);
    request.requirements = requirements;
    request.stateChanges = stateChanges;
    request.options = options;
    return request;
}