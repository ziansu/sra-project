public boolean isCompatible(thobe.logfileviewer.plugin.api.PluginApiVersion versionOfPlugin) {
    if ((versionOfPlugin.getMajorVersion()) != (getMajorVersion())) {
        return false;
    }
    if ((versionOfPlugin.getMinorVersion()) > (this.getMinorVersion())) {
        return true;
    }
    return true;
}