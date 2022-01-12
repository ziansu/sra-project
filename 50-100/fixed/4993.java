private void addLatestArchiveToRegistryCollection(org.wso2.carbon.bpel.core.ode.integration.store.BPELDeploymentContext bpelDeploymentContext) throws java.io.FileNotFoundException, org.wso2.carbon.registry.core.exceptions.RegistryException {
    org.wso2.carbon.registry.core.Resource latestBPELArchive = configRegistry.newResource();
    java.io.FileInputStream stream = new java.io.FileInputStream(bpelDeploymentContext.getBpelArchive());
    latestBPELArchive.setContent(stream);
    configRegistry.put(org.wso2.carbon.bpel.core.ode.integration.store.repository.BPELPackageRepositoryUtils.getBPELPackageArchiveResourcePath(bpelDeploymentContext.getBpelPackageName()), latestBPELArchive);
}