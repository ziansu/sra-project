static <T, R> java.util.function.Function<T, R> decorateFunction(com.codahale.metrics.Timer timer, java.util.function.Function<T, R> function) {
    return (T t) -> {
        try (com.codahale.metrics.Timer.Context context = timer.time()) {
            return function.apply(t);
        }
    };
}