public void setStallProtection(double stallMinPower, double stallTimeout, double resetTimeout) {
    final java.lang.String funcName = "setStallProtection";
    if (trclib.TrcPidMotor.debugEnabled) {
        dbgTrace.traceEnter(funcName, TrcDbgTrace.TraceLevel.API, "stallMinPower=%f,stallTimeout=%f,resetTimeout=%f", stallMinPower, stallTimeout, resetTimeout);
        dbgTrace.traceExit(funcName, TrcDbgTrace.TraceLevel.API);
    }
    this.stallMinPower = java.lang.Math.abs(stallMinPower);
    this.stallTimeout = java.lang.Math.abs(stallTimeout);
    this.resetTimeout = java.lang.Math.abs(resetTimeout);
}