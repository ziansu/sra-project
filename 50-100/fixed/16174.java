@java.lang.Override
public void shutdown() {
    if (terminated) {
        return ;
    }
    terminated = true;
    rsc.util.OpenHashSet<rsc.scheduler.CompositeTimedWorker.TimedTask> set;
    synchronized(this) {
        set = tasks;
        tasks = null;
    }
    if (set != null) {
        java.lang.Object[] array = set.keys();
        for (java.lang.Object tt : array) {
            if (tt != null) {
                ((rsc.scheduler.CompositeTimedWorker.TimedTask) (tt)).cancelFuture();
            }
        }
    }
}