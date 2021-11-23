public io.undertow.Undertow createServer(io.github.mockenize.core.domain.ServerEntity serverEntity) {
    io.github.mockenize.core.server.handler.ServerHttpHandler handler = httpHandlerFactory.create(serverEntity.getId());
    return io.undertow.Undertow.builder().addHttpListener(serverEntity.getPort(), io.github.mockenize.core.server.HttpServerFactory.HOSTNAME).setHandler(handler).build();
}