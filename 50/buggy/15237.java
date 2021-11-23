public java.lang.String getPort() {
    if (isProxied()) {
        return proxyPort.get();
    }else {
        return super.getPort();
    }
}