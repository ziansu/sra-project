public void setWritelog(boolean shouldWrite) {
    try {
        if (((!(this.shouldWrite)) && shouldWrite) && (initialized)) {
            startDumpersThread();
        }else
            if ((this.shouldWrite) && (!shouldWrite)) {
                stopTheCountersThread();
            }
        
        this.shouldWrite = shouldWrite;
    } catch (java.lang.Exception e) {
        org.opendaylight.infrautils.counters.impl.CountersMain.logger.error(e.getMessage(), e);
    }
}