protected void validateLaunchConfigsCircularRefs(io.cattle.platform.core.model.Service service, java.lang.String serviceName, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> launchConfigs) {
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> launchConfigRefs = populateLaunchConfigRefs(service, serviceName, launchConfigs);
    for (java.lang.String launchConfigName : launchConfigRefs.keySet()) {
        validateLaunchConfigCircularRef(launchConfigName, launchConfigRefs, new java.util.ArrayList<java.lang.String>());
    }
}