public reactor.fn.timer.HashWheelTimer.TimerRegistration<T> cancelAfterUse() {
    cancelAfterUse.set(true);
    return this;
}