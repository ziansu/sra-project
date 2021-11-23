private void sendOnOpenMessage(io.netty.channel.ChannelHandlerContext ctx, boolean isSecured, java.lang.String uri) {
    cMsg = new org.wso2.carbon.messaging.StatusCarbonMessage(org.wso2.carbon.transport.http.netty.common.Constants.STATUS_OPEN, 0, null);
    setupCarbonMessage(ctx);
    javax.websocket.Session session = new org.wso2.carbon.transport.http.netty.internal.websocket.WebSocketSessionImpl(ctx, isSecured, uri);
    cMsg.setProperty(Constants.WEBSOCKET_SESSION, session);
    cMsg.setProperty(Constants.CHANNEL_ID, channelId);
    cMsg.setProperty(Constants.CONNECTION, Constants.UPGRADE);
    cMsg.setProperty(Constants.UPGRADE, Constants.WEBSOCKET_UPGRADE);
    org.wso2.carbon.transport.http.netty.listener.WebSocketSessionManager.getInstance().add(uri, session);
    publishToMessageProcessor(cMsg);
}