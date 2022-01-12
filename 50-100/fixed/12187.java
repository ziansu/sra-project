public boolean isCompatible(thobe.logfileviewer.plugin.api.IPluginApiVersion versionOfPlugin) {
    if ((versionOfPlugin.getMajorVersion()) != (getMajorVersion())) {
        return false;
    }
    if ((versionOfPlugin.getMinorVersion()) < (this.getMinorVersion())) {
        return false;
    }
    return true;
}