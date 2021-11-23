protected void validate(java.lang.String clientId, java.lang.String clientSecret, java.lang.String authorizationToken, int type) throws com.liferay.portal.kernel.exception.PortalException {
    weDeployAuthAppPersistence.findByCI_CS(clientId, clientSecret);
    weDeployAuthTokenPersistence.findByCI_T_T(clientId, authorizationToken, type);
}