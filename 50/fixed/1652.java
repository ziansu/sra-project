protected void validate(java.lang.String clientId, java.lang.String clientSecret) throws com.liferay.portal.kernel.exception.PortalException {
    weDeployAuthAppPersistence.findByCI_CS(clientId, clientSecret);
}