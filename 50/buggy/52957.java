public boolean keepAlive() {
    return isOldHttp() ? "Keep-Alive".equals(getHeader("Connection;")) : !("close".equals(getHeader("Connection")));
}