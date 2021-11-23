@java.lang.Override
public void close() {
    if (open.compareAndSet(true, false)) {
        com.questdb.misc.Misc.free(channel);
        com.questdb.misc.Misc.free(request);
        com.questdb.misc.Misc.free(response);
        com.questdb.misc.Misc.free(map);
    }
}