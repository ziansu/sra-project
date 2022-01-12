protected java.lang.String getMobileConnectAPISecret(java.util.Map<java.lang.String, java.lang.String> authenticatorProperties) {
    if ((authenticatorProperties.get(MobileConnectAuthenticatorConstants.MOBILE_CONNECT_API_SECRET)) != null) {
        return authenticatorProperties.get(MobileConnectAuthenticatorConstants.MOBILE_CONNECT_API_SECRET);
    }
    return null;
}