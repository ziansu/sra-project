public org.syncany.plugins.transfer.oauth.OAuthTokenWebListener.Builder setPort(int port) {
    if (com.google.common.collect.Range.open(1, 65535).contains(port)) {
        throw new java.lang.IllegalArgumentException(("Invalid port number " + port));
    }
    if (!(org.syncany.plugins.transfer.oauth.OAuthTokenWebListener.isPortAvailable(port))) {
        throw new java.lang.RuntimeException(("Token listener tried to use a defined but already taken port " + port));
    }
    this.port = port;
    return this;
}