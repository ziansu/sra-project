public static boolean isAuthenticatorEnabled() {
    org.wso2.carbon.core.security.AuthenticatorsConfiguration authenticatorsConfiguration = org.wso2.carbon.core.security.AuthenticatorsConfiguration.getInstance();
    org.wso2.carbon.core.security.AuthenticatorsConfiguration.AuthenticatorConfig authenticatorConfig = authenticatorsConfiguration.getAuthenticatorConfig(OIDCConstants.AUTHENTICATOR_NAME);
    return !(authenticatorConfig.isDisabled());
}