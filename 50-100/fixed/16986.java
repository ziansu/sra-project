@java.lang.SuppressWarnings(value = { "unchecked" , "cast" })
@io.reactivex.CheckReturnValue
@io.reactivex.BackpressureSupport(value = BackpressureKind.FULL)
@io.reactivex.SchedulerSupport(value = SchedulerSupport.CUSTOM)
public static <T> io.reactivex.Flowable<T> fromFuture(java.util.concurrent.Future<? extends T> future, long timeout, java.util.concurrent.TimeUnit unit, io.reactivex.Scheduler scheduler) {
    io.reactivex.ObjectHelper.requireNonNull(scheduler, "scheduler is null");
    return io.reactivex.Flowable.fromFuture(((java.util.concurrent.Future<T>) (future)), timeout, unit).subscribeOn(scheduler);
}