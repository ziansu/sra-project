public cito.stomp.Frame.Builder body(javax.ws.rs.core.MediaType contentType, @javax.annotation.Nonnull
java.nio.ByteBuffer body) {
    if (!(this.command.body())) {
        throw new java.lang.IllegalArgumentException(((this.command) + " does not accept a body!"));
    }
    if (body == null) {
        throw new java.lang.IllegalArgumentException("'body' cannot be null!");
    }
    this.body = body;
    return contentType == null ? this : header(cito.stomp.Headers.CONTENT_TYPE, contentType.toString());
}