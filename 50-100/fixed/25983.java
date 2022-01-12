private boolean shouldContinue() {
    if (((executor.shouldShutDownImmediately()) || ((executor.shouldShutDownWhenNothingToDo()) && (isEmpty()))) || (earlyStop())) {
        if (executor.unregisterThread(this)) {
            return false;
        }
    }
    return true;
}