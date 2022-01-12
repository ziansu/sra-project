public com.aol.cyclops.sequence.HotStream<T> init(java.util.concurrent.Executor exec) {
    java.util.concurrent.CompletableFuture.runAsync(() -> {
        stream.forEach(( a) -> {
            int local = connected;
            for (int i = 0; i < local; i++) {
                connections.get(i).offer(a);
            }
        });
        open.set(false);
    }, exec);
    return this;
}