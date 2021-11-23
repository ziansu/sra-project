@java.lang.Override
public void shutdown() {
    if (terminated) {
        return ;
    }
    terminated = true;
    reactivestreams.commons.util.OpenHashSet<reactivestreams.commons.util.SingleTimedScheduler.CancelFuture> set;
    synchronized(this) {
        set = tasks;
        if (set == null) {
            return ;
        }
        tasks = null;
    }
    java.lang.Object[] keys = set.keys;
    for (java.lang.Object c : keys) {
        if (c != null) {
            ((reactivestreams.commons.util.SingleTimedScheduler.CancelFuture) (c)).cancelFuture();
        }
    }
}