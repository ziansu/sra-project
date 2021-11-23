@java.lang.Override
protected void configure() {
    bind(ratpack.zipkin.ServerTracingHandler.class).to(ratpack.zipkin.internal.DefaultServerTracingHandler.class);
    com.google.inject.Provider<ratpack.zipkin.ServerTracingHandler> serverTracingHandlerProvider = getProvider(ratpack.zipkin.ServerTracingHandler.class);
    bind(ratpack.http.client.HttpClient.class).annotatedWith(ratpack.zipkin.Zipkin.class).to(ratpack.zipkin.internal.ZipkinHttpClientImpl.class);
    bind(ratpack.zipkin.internal.ZipkinHttpClientImpl.class);
    com.google.inject.multibindings.Multibinder.newSetBinder(binder(), ratpack.handling.HandlerDecorator.class).addBinding().toProvider(() -> ratpack.handling.HandlerDecorator.prepend(serverTracingHandlerProvider.get()));
}