@java.lang.Override
public double advanceTime(double dt, java.util.Map<java.lang.String, java.lang.Object> globals, jumpingalien.model.program.statement.CallStack callStack) {
    if (!(waitTimeEvaluated)) {
        this.waitTime = this.durationExpression.evaluate(globals, this.getOwnCallStack(callStack));
    }
    double timeLeft = (this.waitTime) - (this.timeWaited);
    this.timeWaited += dt;
    if (dt < timeLeft) {
        return 0;
    }
    return dt - timeLeft;
}