private boolean shouldContinue() {
    if (((executor.shouldShutDownImmediately()) || ((isEmpty()) && (executor.shouldShutDownWhenNothingToDo()))) || (earlyStop())) {
        if (executor.unregisterThread(this)) {
            return false;
        }
    }
    return true;
}