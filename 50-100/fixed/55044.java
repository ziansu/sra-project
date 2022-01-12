public boolean startProxy() {
    if ((proxy) == null) {
        try {
            com.smartdevicelink.transport.BaseTransportConfig xprt = new com.smartdevicelink.transport.TCPTransportConfig(12345, "192.168.1.2", true);
            proxy = new com.smartdevicelink.proxy.SdlProxyALM(this, com.jacobarau.streamplayer.sdl.SdlProxyHost.APP_NAME, true, com.jacobarau.streamplayer.sdl.SdlProxyHost.APP_ID);
            return true;
        } catch (com.smartdevicelink.exception.SdlException e) {
            e.printStackTrace();
            if ((proxy) == null) {
                return false;
            }
        }
    }
    return true;
}