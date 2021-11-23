public void setup(org.jboss.as.controller.registry.Resource resource, org.jboss.as.controller.registry.ManagementResourceRegistration rootRegistration) {
    org.jboss.as.server.ServerControllerModelUtil.updateCoreModel(model);
    org.jboss.as.server.ServerControllerModelUtil.initOperations(rootRegistration, null, persister, null, null, null, false);
}