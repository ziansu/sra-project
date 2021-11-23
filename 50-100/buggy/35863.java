private org.apache.maven.model.Plugin createSwitchYardPlugin(java.lang.String versionString, java.util.Set<java.lang.String> scanners) {
    java.lang.String label = _projectMetatData.getTargetRuntime().getProperty("switchyard.label");
    boolean isIntegration = label.contains("Integration");
    if (isIntegration) {
        return org.switchyard.tools.ui.M2EUtils.createSwitchYardPlugin(null, true, scanners);
    }
    return org.switchyard.tools.ui.M2EUtils.createSwitchYardPlugin(versionString, true, scanners);
}