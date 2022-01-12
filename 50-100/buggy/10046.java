private com.xebialabs.deployit.plugin.api.udm.Deployed<?, ?> getDeployed(java.lang.String version) {
    com.xebialabs.deployit.plugin.api.udm.Deployed<?, ?> puppetModule = deployed(((com.xebialabs.deployit.plugin.api.udm.Deployable) (com.xebialabs.platform.test.TestUtils.newInstance("puppet.ModuleSpec", "puppetlabs-apache"))), container, "puppet.Module");
    puppetModule.setProperty("version", version);
    puppetModule.setProperty("force", true);
    puppetModule.setProperty("ignoreDependencies", false);
    return puppetModule;
}