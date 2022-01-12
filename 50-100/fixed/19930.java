private void sendOnOpenMessage(io.netty.channel.ChannelHandlerContext ctx, boolean isSecured, java.lang.String uri) {
    cMsg = new org.wso2.carbon.messaging.StatusCarbonMessage(org.wso2.carbon.transport.http.netty.common.Constants.STATUS_OPEN, 0, null);
    javax.websocket.Session session = new org.wso2.carbon.transport.http.netty.internal.websocket.WebSocketSessionImpl(ctx, isSecured, uri, channelId);
    org.wso2.carbon.transport.http.netty.listener.WebSocketSessionManager.getInstance().add(uri, session);
    setupCarbonMessage(ctx);
    cMsg.setProperty(Constants.CONNECTION, Constants.UPGRADE);
    cMsg.setProperty(Constants.UPGRADE, Constants.WEBSOCKET_UPGRADE);
    publishToMessageProcessor(cMsg);
}