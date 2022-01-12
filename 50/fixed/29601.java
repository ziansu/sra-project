public void check(java.lang.String name) {
    org.apache.catalina.startup.HostConfig.DeployedApplication app = deployed.get(name);
    if (app != null) {
        checkResources(app, true);
    }
    deployApps(name);
}