@java.lang.Override
public synchronized void allocate(com.cloudera.director.vsphere.compute.VSphereComputeInstanceTemplate template, java.util.Collection<java.lang.String> instanceIds, int minCount) throws java.lang.InterruptedException {
    com.cloudera.director.spi.v1.model.LocalizationContext providerLocalizationContext = getLocalizationContext();
    com.cloudera.director.spi.v1.model.LocalizationContext templateLocalizationContext = com.cloudera.director.spi.v1.model.util.SimpleResourceTemplate.getTemplateLocalizationContext(providerLocalizationContext);
    try {
        com.cloudera.director.vsphere.service.intf.IGroupProvisionService groupProvisionService = new com.cloudera.director.vsphere.service.impl.GroupProvisionService(this.credentials, template, template.getConfigurationValue(com.cloudera.director.spi.v1.model.InstanceTemplate.InstanceTemplateConfigurationPropertyToken.INSTANCE_NAME_PREFIX, templateLocalizationContext), instanceIds, minCount);
        groupProvisionService.provision();
        this.allocations.putAll(groupProvisionService.getAllocations());
    } catch (java.lang.Exception e) {
        throw new com.cloudera.director.vsphere.exception.VsphereDirectorException(e);
    }
}