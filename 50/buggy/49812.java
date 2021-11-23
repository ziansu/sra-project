static Try.CheckedRunnable decorateCheckedRunnable(com.codahale.metrics.Timer timer, javaslang.control.Try.CheckedRunnable runnable) {
    return () -> {
        com.codahale.metrics.Timer.Context context = timer.time();
        try {
            runnable.run();
        } finally {
            context.stop();
        }
    };
}