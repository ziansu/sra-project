static <T, R> javaslang.control.Try.CheckedFunction<T, R> decorateCheckedFunction(com.codahale.metrics.Timer timer, javaslang.control.Try.CheckedFunction<T, R> function) {
    return (io.github.resilience4j.metrics.T t) -> {
        try (com.codahale.metrics.Timer.Context context = timer.time()) {
            return function.apply(t);
        }
    };
}