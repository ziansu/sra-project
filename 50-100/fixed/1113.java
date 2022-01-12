private org.osc.sdk.manager.element.ApplianceBootstrapInformationElement generateBootstrapInfo(final org.osc.core.broker.model.entities.appliance.VirtualSystem vs, final java.lang.String applianceName) throws java.lang.Exception {
    try (org.osc.sdk.manager.api.ManagerDeviceApi deviceApi = this.apiFactoryService.createManagerDeviceApi(vs)) {
        java.util.Map<java.lang.String, java.lang.String> bootstrapProperties = vs.getApplianceSoftwareVersion().getConfigProperties();
        return deviceApi.getBootstrapinfo(new org.osc.core.broker.service.tasks.conformance.openstack.deploymentspec.OsSvaServerCreateTask.ApplianceBootStrap(applianceName, com.google.common.collect.ImmutableMap.copyOf(bootstrapProperties)));
    }
}