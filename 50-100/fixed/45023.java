@java.lang.Override
public boolean isPlainPort(java.net.InetSocketAddress localAddress) {
    if (java.lang.Boolean.getBoolean("hypersocket.development")) {
        return (localAddress.getPort()) == 8080;
    }else {
        if ((configurationService.getIntValue("http.port")) > 0) {
            return (localAddress.getPort()) == (configurationService.getIntValue("http.port"));
        }
        return true;
    }
}