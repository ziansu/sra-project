public void setEnabled(boolean enabled) {
    final java.lang.String funcName = "setEnabled";
    boolean wasEnabled = pixyCam.isTaskEnabled();
    if (frclib.FrcPixyCam.debugEnabled) {
        dbgTrace.traceEnter(funcName, TrcDbgTrace.TraceLevel.API, "enanbled=%s", java.lang.Boolean.toString(enabled));
    }
    pixyCam.setTaskEnabled(enabled);
    if ((!wasEnabled) && enabled) {
        start();
    }
    if (frclib.FrcPixyCam.debugEnabled) {
        dbgTrace.traceExit(funcName, TrcDbgTrace.TraceLevel.API);
    }
}