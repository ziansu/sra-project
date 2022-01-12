@java.lang.Override
public boolean isPlainPort(java.net.InetSocketAddress localAddress) {
    if (java.lang.Boolean.getBoolean("hypersocket.development")) {
        return (localAddress.getPort()) == 8080;
    }else {
        return (localAddress.getPort()) == (configurationService.getIntValue("http.port"));
    }
}