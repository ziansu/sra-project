public static void set(java.lang.String name, long v) {
    java.util.concurrent.atomic.AtomicLong ref = solo.julian.zhu.engine.statistics.TSC.cm.get(name);
    if (ref == null) {
        synchronized(solo.julian.zhu.engine.statistics.TSC.cm) {
            ref = new java.util.concurrent.atomic.AtomicLong(v);
            java.util.concurrent.atomic.AtomicLong old = solo.julian.zhu.engine.statistics.TSC.cm.put(name, ref);
            if (old != null) {
                ref.set(v);
            }
        }
    }else {
        ref.set(v);
    }
}