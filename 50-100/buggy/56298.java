@java.lang.Override
public stormpot.slow.GenericPoolable apply(stormpot.slow.Slot slot, stormpot.slow.GenericPoolable obj) throws java.lang.Exception {
    if (first) {
        threads.setThreadCpuTimeEnabled(true);
        first = false;
    }
    long cpuTime = threads.getCurrentThreadCpuTime();
    long userTime = threads.getCurrentThreadUserTime();
    lastUserTimeIncrement.set((userTime - (lastUserTimeIncrement.get())));
    return $new.apply(slot, obj);
}