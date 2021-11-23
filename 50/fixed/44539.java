@java.lang.Override
public com.github.kristofa.brave.ServerSpan getCurrentServerSpan() {
    return registry.get().maybeGet(ratpack.zipkin.internal.RatpackServerClientLocalSpanState.ServerSpanValue.class).orElse(new ratpack.zipkin.internal.RatpackServerClientLocalSpanState.ServerSpanValue(com.github.kristofa.brave.ServerSpan.EMPTY)).get();
}