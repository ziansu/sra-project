@java.lang.Override
public boolean OnGatewayAuthenticate(java.lang.StringBuilder username, java.lang.StringBuilder domain, java.lang.StringBuilder password) {
    return this.OnAuthenticate(username, domain, password);
}