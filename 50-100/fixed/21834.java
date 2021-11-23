private java.util.Set<java.lang.String> getServiceNamesInStack(long environmentId) {
    java.util.Set<java.lang.String> servicesInEnv = new java.util.HashSet<java.lang.String>();
    java.util.List<? extends io.cattle.platform.core.model.Service> services = objectManager.find(io.cattle.platform.core.model.Service.class, SERVICE.ENVIRONMENT_ID, environmentId, SERVICE.REMOVED, null);
    for (io.cattle.platform.core.model.Service service : services) {
        servicesInEnv.add(service.getName().toLowerCase());
    }
    return servicesInEnv;
}