public static void close() {
    for (com.lmax.disruptor.dsl.Disruptor<?> value : com.on36.haetae.hsr.EventBus.mapDisruptor.values()) {
        value.shutdown();
    }
    com.on36.haetae.hsr.EventBus.disruptorExecutors.shutdown();
}