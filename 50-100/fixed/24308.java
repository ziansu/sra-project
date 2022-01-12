@java.lang.Override
public AuthUtil.AuthMode currentAuthenticationMode() {
    com.emc.storageos.security.authentication.AuthUtil.AuthMode authMode = AuthUtil.AuthMode.normal;
    for (com.emc.storageos.auth.impl.AuthenticationProvider ap : _authNProviders.getAuthenticationProviders()) {
        if (((ap.getProviderConfig()) != null) && (ap.getProviderConfig().getMode().equals(AuthUtil.AuthMode.oidc.name()))) {
            authMode = AuthUtil.AuthMode.oidc;
            break;
        }
    }
    _log.info("Current authentication mode is {}", authMode.name());
    return authMode;
}