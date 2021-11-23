@java.lang.Override
public void installPlugin(java.lang.String name, java.lang.String version, java.lang.String kar, java.lang.String url, java.lang.String uid) throws java.lang.Exception {
    this.hubManager.installPlugin(kar, name);
    this.configDataService.savePlugin(name, version, kar, url, uid);
}