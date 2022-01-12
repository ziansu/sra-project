public void destroy() {
    isShutdown.set(true);
    if ((framework) != null)
        framework.destroy();
    
    httpChannels.close();
    websocketChannels.write(new org.jboss.netty.handler.codec.http.websocketx.CloseWebSocketFrame());
    suspendTimer.shutdown();
}