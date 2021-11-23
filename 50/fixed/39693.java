private boolean selectedDebugIntervalShouldBeReset() {
    return ((selectedDebugInterval) == null) || (!(latestDebugIntervals.contains(selectedDebugInterval)));
}