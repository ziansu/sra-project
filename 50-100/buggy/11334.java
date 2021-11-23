public boolean hasContent() {
    return ((((io.netty.handler.codec.http.HttpResponseStatus.OK) != (status)) || (null != (messenger.getRedirectTo()))) || (null != (content))) || (null != (file));
}