public void setWritelog(boolean shouldWrite) {
    if (((!(this.shouldWrite)) && shouldWrite) && (initialized)) {
        startDumpersThread();
    }else
        if ((this.shouldWrite) && (!shouldWrite)) {
            stopTheCountersThread();
        }
    
    this.shouldWrite = shouldWrite;
}