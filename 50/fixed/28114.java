@java.lang.Override
protected boolean isFinished() {
    return (!(Robot.ballHolder.canGoHigher())) && (!((Robot.oi.forceButton.get()) && (forceable)));
}