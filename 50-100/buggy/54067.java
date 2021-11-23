public void zeroCalibrate(double calPower) {
    final java.lang.String funcName = "zeroCalibrate";
    if (trclib.TrcPidMotor.debugEnabled) {
        dbgTrace.traceEnter(funcName, TrcDbgTrace.TraceLevel.API, "calPower=%f", calPower);
    }
    if (calPower > 0.0) {
        calPower = -calPower;
    }
    this.calPower = calPower;
    motor1ZeroCalDone = false;
    motor2ZeroCalDone = ((motor2) == null) || ((syncGain) == 0.0);
    setActive(true);
    if (trclib.TrcPidMotor.debugEnabled) {
        dbgTrace.traceExit(funcName, TrcDbgTrace.TraceLevel.API);
    }
}