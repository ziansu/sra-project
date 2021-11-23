public void setStallProtection(double stallMinPower, double stallTimeout, double resetTimeout) {
    final java.lang.String funcName = "setStallProtection";
    if (trclib.TrcPidMotor.debugEnabled) {
        dbgTrace.traceEnter(funcName, TrcDbgTrace.TraceLevel.API, "stallMinPower=%f,stallTimeout=%f,resetTimeout=%f", stallMinPower, stallTimeout, resetTimeout);
        dbgTrace.traceExit(funcName, TrcDbgTrace.TraceLevel.API);
    }
    this.stallMinPower = stallMinPower;
    this.stallTimeout = stallTimeout;
    this.resetTimeout = resetTimeout;
}