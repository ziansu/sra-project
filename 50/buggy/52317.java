public void addHttpContent(io.netty.handler.codec.http.HttpContent httpContent) {
    if (httpContent instanceof io.netty.handler.codec.http.LastHttpContent) {
        setEndOfMsgAdded(true);
    }
    httpContentQueue.add(httpContent);
}