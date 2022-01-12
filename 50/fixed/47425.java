@java.lang.Override
protected void releaseResources() {
    ebean.shutdown(false, false);
}