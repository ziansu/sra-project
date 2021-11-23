@org.testng.annotations.Test
public void testListUserAssociations() throws java.lang.Exception {
    org.wso2.is.portal.user.client.association.FederatedAccountAssociationClientService userAccountAssociationClientService = getFederatedAccountAssociationClientService();
    org.wso2.carbon.security.caas.user.core.bean.User testUser = new org.wso2.carbon.security.caas.user.core.bean.User.UserBuilder().setUserId("testUser").setIdentityStore(new org.wso2.carbon.security.caas.user.core.store.IdentityStoreImpl()).setAuthorizationStore(new org.wso2.carbon.security.caas.user.core.store.AuthorizationStoreImpl()).setPrimaryAttributeValue("userId").setClaimManager(new org.wso2.carbon.security.caas.user.core.claim.InMemoryClaimManager()).build();
    org.testng.Assert.assertNotNull(userAccountAssociationClientService.listUserAssociations(testUser));
}