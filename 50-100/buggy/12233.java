@org.junit.Test
public void shouldInstallAndUnInstallPuppetModule() {
    com.xebialabs.deployit.plugin.api.udm.Deployed<?, ?> deployed = getDeployed("1.5.0");
    org.junit.Assert.assertThat(getSteps(deployed).size(), org.hamcrest.CoreMatchers.equalTo(2));
    com.xebialabs.deployit.plugin.api.udm.DeployedApplication puppetModuleApp = newDeployedApplication("puppetlabs-apache", "1.5.0", deployed);
    assertInitial(puppetModuleApp);
    getPuppetModuleListCommandOutput();
    assertModuleInstallAndVersionCheck(com.xebialabs.deployit.plugin.puppet.module.APACHE_MODULE_VERSION_1_5_0);
    assertUndeploy(puppetModuleApp);
    getPuppetModuleListCommandOutput();
    org.junit.Assert.assertThat(executionContext.getCapturedOutput(), hasItem(not(containsString("puppetlabs-apache"))));
}