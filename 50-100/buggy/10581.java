@java.lang.Override
public boolean configChanged() {
    int currentConfigHash = this.configProps.hashCode();
    boolean configChanged = (this.propsHashCode) != currentConfigHash;
    if (configChanged && (net.jawr.web.resource.bundle.factory.PropsConfigPropertiesSource.LOGGER.isDebugEnabled()))
        net.jawr.web.resource.bundle.factory.PropsConfigPropertiesSource.LOGGER.debug("Changes in configuration properties file detected.");
    
    this.propsHashCode = currentConfigHash;
    return configChanged;
}