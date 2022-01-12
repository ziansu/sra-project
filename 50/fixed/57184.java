@java.lang.Override
public void inValidateToken(net.respectnetwork.sdk.csp.notification.TokenKey tokenKey) throws net.respectnetwork.sdk.csp.notification.TokenException {
    if (tokenKey != null) {
        net.respectnetwork.sdk.csp.notification.AnotherBasicTokenManager.tokenCache.remove(tokenKey.toString());
    }
}