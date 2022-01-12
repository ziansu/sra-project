@org.testng.annotations.Test
public void testGetAndSetEntitlementService() {
    org.wso2.carbon.identity.application.authz.xacml.internal.AppAuthzDataholder appAuthzDataholder = org.wso2.carbon.identity.application.authz.xacml.internal.AppAuthzDataholder.getInstance();
    org.testng.Assert.assertNull(appAuthzDataholder.getEntitlementService());
    appAuthzDataholder.setEntitlementService(org.powermock.api.mockito.PowerMockito.mock(org.wso2.carbon.identity.entitlement.EntitlementService.class));
    org.testng.Assert.assertNotNull(appAuthzDataholder.getEntitlementService());
    org.powermock.api.mockito.PowerMockito.verifyStatic(org.mockito.Mockito.times(1));
}