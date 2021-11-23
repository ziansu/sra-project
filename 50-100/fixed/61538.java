@java.lang.SuppressWarnings(value = "unchecked")
public static <T> java.util.concurrent.Flow.Publisher<T> toFlow(org.reactivestreams.org.reactivestreams.Publisher<? extends T> reactivePublisher) {
    java.util.Objects.requireNonNull(reactivePublisher, "reactivePublisher");
    if (reactivePublisher instanceof java.util.concurrent.Flow.Publisher) {
        return ((java.util.concurrent.Flow.Publisher<org.reactivestreams.T>) (reactivePublisher));
    }
    if (reactivePublisher instanceof org.reactivestreams.ReactiveFlowBridge.ReactivePublisherFromFlow) {
        return ((java.util.concurrent.Flow.Publisher<org.reactivestreams.T>) (((org.reactivestreams.ReactiveFlowBridge.ReactivePublisherFromFlow<org.reactivestreams.T>) (reactivePublisher)).flow));
    }
    return new org.reactivestreams.ReactiveFlowBridge.FlowPublisherFromReactive(reactivePublisher);
}