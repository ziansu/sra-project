public boolean isStalled(double stallTime) {
    final java.lang.String funcName = "isStalled";
    boolean stalled = ((trclib.TrcUtil.getCurrentTime()) - (stallStartTime)) >= stallTime;
    if (trclib.TrcDriveBase.debugEnabled) {
        dbgTrace.traceEnter(funcName, TrcDbgTrace.TraceLevel.API, "stallTime=%.3f", stallTime);
        dbgTrace.traceExit(funcName, TrcDbgTrace.TraceLevel.API, "=%s", java.lang.Boolean.toString(stalled));
    }
    return stalled;
}