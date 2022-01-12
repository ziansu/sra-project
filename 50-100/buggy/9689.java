@org.junit.Test
public void testConnectionNonExistentUser() {
    final com.blackducksoftware.integration.hub.jenkins.PostBuildScanDescriptor descriptor = new com.blackducksoftware.integration.hub.jenkins.PostBuildScanDescriptor();
    final hudson.util.FormValidation form = descriptor.doTestConnection(com.blackducksoftware.integration.hub.jenkins.tests.PostBuildScanDescriptorTest.testProperties.getProperty("TEST_HUB_SERVER_URL"), "NONEXITENTCREDENTIAL", "120");
    junit.framework.Assert.assertEquals(FormValidation.Kind.ERROR, form.kind);
    junit.framework.Assert.assertTrue(form.getMessage().contains("User needs to specify which credentials to use."));
}