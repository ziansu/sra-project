public void destroy() {
    isShutdown.set(true);
    httpChannels.close();
    websocketChannels.write(new org.jboss.netty.handler.codec.http.websocketx.CloseWebSocketFrame());
    if ((framework) != null)
        framework.destroy();
    
    suspendTimer.shutdown();
}