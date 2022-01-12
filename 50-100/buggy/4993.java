private void addLatestArchiveToRegistryCollection(org.wso2.carbon.bpel.core.ode.integration.store.BPELDeploymentContext bpelDeploymentContext) throws java.io.FileNotFoundException, org.wso2.carbon.registry.core.exceptions.RegistryException {
    org.wso2.carbon.registry.core.Resource latestBPELArchive = configRegistry.newResource();
    try (java.io.FileInputStream stream = new java.io.FileInputStream(bpelDeploymentContext.getBpelArchive())) {
        latestBPELArchive.setContent(stream);
    } catch (java.io.IOException exception) {
        org.wso2.carbon.bpel.core.ode.integration.store.repository.BPELPackageRepository.log.error(("Error reading bpel archive " + (bpelDeploymentContext.getBpelArchive().getName())), exception);
    }
    configRegistry.put(org.wso2.carbon.bpel.core.ode.integration.store.repository.BPELPackageRepositoryUtils.getBPELPackageArchiveResourcePath(bpelDeploymentContext.getBpelPackageName()), latestBPELArchive);
}