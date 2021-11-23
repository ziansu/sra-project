@io.reactivex.CheckReturnValue
@io.reactivex.BackpressureSupport(value = BackpressureKind.FULL)
@io.reactivex.SchedulerSupport(value = SchedulerSupport.NONE)
public static <T, R> io.reactivex.Flowable<R> zip(io.reactivex.Publisher<? extends io.reactivex.Publisher<? extends T>> sources, final io.reactivex.Function<? super java.lang.Object[], ? extends R> zipper) {
    io.reactivex.ObjectHelper.requireNonNull(zipper, "zipper is null");
    return io.reactivex.Flowable.fromPublisher(sources).toList().flatMapPublisher(io.reactivex.FlowableInternalHelper.<T, R>zipIterable(zipper));
}