@java.lang.Override
protected void releaseResources() {
    ebean.shutdown(true, true);
}