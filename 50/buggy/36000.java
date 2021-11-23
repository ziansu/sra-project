boolean isTimedOut() {
    if (((timeoutTrigger) != null) && (triggerHandle.isDone())) {
        return true;
    }
    return false;
}