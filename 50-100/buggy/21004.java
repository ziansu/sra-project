public static void add(java.lang.String name, long v) {
    java.util.concurrent.atomic.AtomicLong ref = solo.julian.zhu.engine.statistics.TSC.cm.get(name);
    if (ref == null) {
        ref = new java.util.concurrent.atomic.AtomicLong(v);
        java.util.concurrent.atomic.AtomicLong old = solo.julian.zhu.engine.statistics.TSC.cm.put(name, ref);
        if (old != null) {
            ref.addAndGet(old.get());
        }
    }else {
        ref.addAndGet(v);
    }
}