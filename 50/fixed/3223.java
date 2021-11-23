private com.quali.cloudshell.RestResponse Login() throws java.security.KeyManagementException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException {
    return com.quali.cloudshell.HTTPWrapper.InvokeLogin(GetBaseUrl(false), this.server.user, this.server.pw, this.server.domain, this.server.ignoreSSL);
}