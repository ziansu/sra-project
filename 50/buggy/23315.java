@java.lang.Override
public void setCurrentServerSpan(final com.github.kristofa.brave.ServerSpan span) {
    registry.add(new ratpack.zipkin.internal.RatpackServerClientLocalSpanState.ServerSpanValue(span));
}