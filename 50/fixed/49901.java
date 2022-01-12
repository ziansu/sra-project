public java.lang.String requestTokenFromServer() {
    keyServerSetup();
    java.lang.String key = executeP2pScript("start_x11vnc.sh", keyServerIp, keyServerHttpPort);
    this.key.set(key);
    return key;
}