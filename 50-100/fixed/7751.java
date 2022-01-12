protected void check() {
    if (host.getAutoDeploy()) {
        org.apache.catalina.startup.HostConfig.DeployedApplication[] apps = deployed.values().toArray(new org.apache.catalina.startup.HostConfig.DeployedApplication[0]);
        for (int i = 0; i < (apps.length); i++) {
            if (!(isServiced(apps[i].name)))
                checkResources(apps[i], false);
            
        }
        if (host.getUndeployOldVersions()) {
            checkUndeploy();
        }
        deployApps();
    }
}