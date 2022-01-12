public void send(java.lang.String view) {
    setDate();
    setHttpResponse(new com.razor.mvc.http.DefaultFullHttpResponse(io.netty.handler.codec.http.HttpVersion.HttpVersion.HTTP_1_1, getStatus(), io.netty.buffer.Unpooled.copiedBuffer(view.toString(), CharsetUtil.UTF_8)));
    writeFlush(true);
}