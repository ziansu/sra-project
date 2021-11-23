@java.lang.Override
public int getPort() {
    if (isProxied()) {
        return proxyPort.get();
    }else {
        return super.getPort();
    }
}