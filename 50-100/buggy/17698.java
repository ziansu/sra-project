static void monitorExitSync(org.teavm.classlib.java.lang.TObject o) {
    if ((o.isEmptyMonitor()) || ((o.monitor.owner) != (org.teavm.classlib.java.lang.TThread.currentThread()))) {
        throw new org.teavm.classlib.java.lang.TIllegalMonitorStateException();
    }
    --(o.monitor.count);
    o.isEmptyMonitor();
}