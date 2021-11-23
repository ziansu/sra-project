public void onClose(org.apache.tomcat.util.net.SocketWrapper<java.lang.Long> socketWrapper) {
    org.apache.coyote.spdy.SpdyAprNpnHandler.SpdyFramerApr wrapper = lightProcessors.remove(socketWrapper);
    if (wrapper != null) {
        wrapper.onClose(socketWrapper);
    }
}