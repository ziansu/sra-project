static java.lang.Runnable decorateRunnable(com.codahale.metrics.Timer timer, java.lang.Runnable runnable) {
    return () -> {
        com.codahale.metrics.Timer.Context context = timer.time();
        try {
            runnable.run();
        } finally {
            context.stop();
        }
    };
}