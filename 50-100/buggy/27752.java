@java.lang.Override
public void restorePlugin(java.lang.Long id, java.lang.String name, java.lang.String version, java.lang.String kar, java.lang.String url, java.lang.String uid) throws java.lang.Exception {
    this.hubManager.uninstallPlugin(name);
    this.hubManager.installPlugin(kar, name);
    this.configDataService.deletePlugin(id);
    this.configDataService.savePlugin(name, version, kar, url, uid);
}