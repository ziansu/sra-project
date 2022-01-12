@java.lang.Override
public void tearDown(final org.jboss.as.arquillian.container.ManagementClient managementClient) throws java.lang.Exception {
    org.jboss.as.test.integration.web.rootcontext.RootContextUtil.undeploy(managementClient.getControllerClient(), "root-web.ear");
    org.jboss.as.test.integration.web.rootcontext.RootContextUtil.removeVirtualServer(managementClient.getControllerClient(), org.jboss.as.test.integration.web.rootcontext.RootContextEarUnitTestCase.HOST);
}