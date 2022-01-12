@org.junit.Test
public void minimalDriverConfiguration() throws java.rmi.RemoteException {
    com.elastisys.scale.cloudpool.commons.basepool.driver.DriverConfig configuration = com.elastisys.scale.commons.json.JsonUtils.toObject(com.elastisys.scale.commons.json.JsonUtils.parseJsonResource(minimalConfigPath), com.elastisys.scale.cloudpool.commons.basepool.driver.DriverConfig.class);
    assertFalse(driver.isConfigured());
    driver.configure(configuration);
    assertTrue(driver.isConfigured());
    org.mockito.Mockito.verify(mockedClient).configure(org.mockito.Matchers.any(com.elastisys.scale.cloudpool.vsphere.driver.config.VsphereApiSettings.class), org.mockito.Matchers.any(com.elastisys.scale.cloudpool.vsphere.driver.config.VsphereProvisioningTemplate.class));
}