@java.lang.Override
public com.twitter.zipkin.gen.Span getCurrentLocalSpan() {
    return registry.get().get(ratpack.zipkin.internal.RatpackServerClientLocalSpanState.LocalSpanValue.class).get();
}