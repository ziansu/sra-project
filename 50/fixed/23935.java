@org.junit.Test(expected = org.openremote.controller.exception.ConfigurationException.class)
public void testGetControllerDefinitionFileEmptyString() throws java.lang.Exception {
    org.openremote.controller.ControllerConfiguration cc = new org.openremote.controller.ControllerConfiguration();
    cc.setResourcePath("");
    java.io.File f = org.openremote.controller.deployer.Version20ModelBuilder.getControllerDefinitionFile(cc);
}