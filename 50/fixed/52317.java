public void addHttpContent(io.netty.handler.codec.http.HttpContent httpContent) {
    httpContentQueue.add(httpContent);
    if (httpContent instanceof io.netty.handler.codec.http.LastHttpContent) {
        setEndOfMsgAdded(true);
    }
}