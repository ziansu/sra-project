static Try.CheckedRunnable decorateCheckedRunnable(com.codahale.metrics.Timer timer, javaslang.control.Try.CheckedRunnable runnable) {
    return () -> {
        try (com.codahale.metrics.Timer.Context context = timer.time()) {
            runnable.run();
        }
    };
}