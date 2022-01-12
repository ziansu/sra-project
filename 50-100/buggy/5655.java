@java.lang.Override
public org.eclipse.cdt.core.ICommandLauncher getCommandLauncher(org.eclipse.cdt.core.settings.model.ICConfigurationDescription cfgd) {
    org.eclipse.cdt.managedbuilder.core.IConfiguration cfg = org.eclipse.cdt.managedbuilder.core.ManagedBuildManager.getConfigurationForDescription(cfgd);
    org.eclipse.cdt.managedbuilder.buildproperties.IOptionalBuildProperties props = cfg.getOptionalBuildProperties();
    if (props != null) {
        java.lang.String enablementProperty = props.getProperty(ContainerCommandLauncher.CONTAINER_BUILD_ENABLED);
        if (enablementProperty != null) {
            boolean enableContainer = java.lang.Boolean.parseBoolean(enablementProperty);
            if (enableContainer) {
                return new org.eclipse.cdt.internal.docker.launcher.ContainerCommandLauncher();
            }
        }
    }
    return null;
}