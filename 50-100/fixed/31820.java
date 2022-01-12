private io.undertow.Undertow createUndertowServer() throws javax.servlet.ServletException {
    io.undertow.server.HttpHandler httpHandler = this.manager.start();
    httpHandler = getContextHandler(httpHandler);
    if (this.useForwardHeaders) {
        httpHandler = io.undertow.Handlers.proxyPeerAddress(httpHandler);
    }
    this.builder.setHandler(httpHandler);
    return this.builder.build();
}