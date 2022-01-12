@java.lang.Override
public java.lang.String getToken() throws java.io.IOException {
    if (((authenticationResult) == null) || ((authenticationResult.getAccessToken()) == null)) {
        acquireAccessToken();
    }
    return authenticationResult.getAccessToken();
}