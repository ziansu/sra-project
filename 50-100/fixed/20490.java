public final <R> xiaofei.library.shelly.scheduler.Scheduler<R> schedule(java.util.List<? extends xiaofei.library.shelly.function.Function1<java.util.concurrent.CopyOnWriteArrayList<T>, java.util.concurrent.CopyOnWriteArrayList<R>>> functions) {
    synchronized(this) {
        for (xiaofei.library.shelly.function.Function1<java.util.concurrent.CopyOnWriteArrayList<T>, java.util.concurrent.CopyOnWriteArrayList<R>> function : functions) {
            int size = mInputs.size();
            onSchedule(new ScheduledRunnable(new BlockingRunnable<R>(function), size));
        }
        return ((xiaofei.library.shelly.scheduler.Scheduler<R>) (this));
    }
}