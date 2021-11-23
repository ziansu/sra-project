static <T, R> javaslang.control.Try.CheckedFunction<T, R> decorateCheckedFunction(com.codahale.metrics.Timer timer, javaslang.control.Try.CheckedFunction<T, R> function) {
    return (io.github.resilience4j.metrics.T t) -> {
        com.codahale.metrics.Timer.Context context = timer.time();
        try {
            return function.apply(t);
        } finally {
            context.stop();
        }
    };
}