public void initialize() {
    try {
        initialized = true;
        if (shouldWrite) {
            startDumpersThread();
        }
    } catch (java.lang.Exception e) {
        org.opendaylight.infrautils.counters.impl.CountersMain.logger.error(e.getMessage(), e);
    }
}