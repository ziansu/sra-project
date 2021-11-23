protected boolean isFinished() {
    return (gearHandler.isAtBackLimit()) || (this.isTimedOut());
}