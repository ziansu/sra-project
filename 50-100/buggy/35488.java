public static <T, R> java.util.function.Function<T, org.jenetics.engine.TimedResult<R>> of(final java.util.function.Function<? super T, ? extends R> function, final java.time.Clock clock) {
    return ( value) -> {
        final org.jenetics.engine.Timer timer = org.jenetics.engine.Timer.of().start();
        final R result = function.apply(value);
        return new org.jenetics.engine.TimedResult(timer.stop().getTime(), result);
    };
}