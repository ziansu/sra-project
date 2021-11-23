@java.lang.Override
public void close(javax.websocket.CloseReason closeReason) {
    ctx.channel().writeAndFlush(new io.netty.handler.codec.http.websocketx.CloseWebSocketFrame(closeReason.getCloseCode().getCode(), closeReason.getReasonPhrase()));
    ctx.channel().close();
}