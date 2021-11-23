private void sendOnOpenMessage(io.netty.channel.ChannelHandlerContext ctx, boolean isSecured, java.lang.String uri) throws java.net.URISyntaxException {
    cMsg = new org.wso2.carbon.messaging.StatusCarbonMessage(org.wso2.carbon.transport.http.netty.common.Constants.STATUS_OPEN, 0, null);
    javax.websocket.Session session = new org.wso2.carbon.transport.http.netty.internal.websocket.WebSocketSessionImpl(ctx, isSecured, uri, channelId);
    setupCarbonMessage(ctx);
    cMsg.setProperty(Constants.CONNECTION, Constants.UPGRADE);
    cMsg.setProperty(Constants.UPGRADE, Constants.WEBSOCKET_UPGRADE);
    publishToMessageProcessor(cMsg);
}