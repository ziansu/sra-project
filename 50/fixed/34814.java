@java.lang.Override
public com.twitter.zipkin.gen.Span getCurrentClientSpan() {
    return registry.get().maybeGet(ratpack.zipkin.internal.RatpackServerClientLocalSpanState.ClientSpanValue.class).orElse(new ratpack.zipkin.internal.RatpackServerClientLocalSpanState.ClientSpanValue(null)).get();
}