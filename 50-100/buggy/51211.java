static <T, R> java.util.function.Function<T, R> decorateFunction(com.codahale.metrics.Timer timer, java.util.function.Function<T, R> function) {
    return (T t) -> {
        com.codahale.metrics.Timer.Context context = timer.time();
        try {
            return function.apply(t);
        } finally {
            context.stop();
        }
    };
}