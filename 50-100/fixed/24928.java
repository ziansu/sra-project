protected void upgradeLaunchConfigFields(io.cattle.platform.core.model.Service service, java.util.Map<java.lang.String, java.lang.Object> launchConfigToUpgrade, java.util.Map<java.lang.String, java.lang.Object> newLaunchConfig) {
    java.lang.Integer version = new java.lang.Integer(java.lang.Integer.valueOf(launchConfigToUpgrade.get(ServiceDiscoveryConstants.FIELD_VERSION).toString()));
    for (java.lang.String key : newLaunchConfig.keySet()) {
        launchConfigToUpgrade.put(key, newLaunchConfig.get(key));
    }
    launchConfigToUpgrade.put(ServiceDiscoveryConstants.FIELD_VERSION, java.lang.String.valueOf((version + 1)));
}