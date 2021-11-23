private io.undertow.Undertow createUndertowServer() {
    try {
        io.undertow.server.HttpHandler httpHandler = this.manager.start();
        httpHandler = getContextHandler(httpHandler);
        if (this.useForwardHeaders) {
            httpHandler = io.undertow.Handlers.proxyPeerAddress(httpHandler);
        }
        this.builder.setHandler(httpHandler);
        return this.builder.build();
    } catch (javax.servlet.ServletException ex) {
        throw new org.springframework.boot.context.embedded.EmbeddedServletContainerException("Unable to start embdedded Undertow", ex);
    }
}