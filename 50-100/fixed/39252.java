public final void start() {
    if ((timer) != 0) {
        startTime = java.lang.System.currentTimeMillis();
        try {
            java.lang.Thread.sleep(timer);
        } catch (java.lang.Exception ex) {
        }
        onExecute(((java.lang.System.currentTimeMillis()) - (startTime)));
    }else {
        onExecute(0L);
    }
}