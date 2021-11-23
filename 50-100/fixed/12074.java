java.util.ArrayList<java.lang.Runnable> dependentStopped() {
    assert java.lang.Thread.holdsLock(this);
    final java.util.ArrayList<java.lang.Runnable> tasks;
    synchronized(this) {
        final boolean leavingRestState = isStableRestState();
        if ((--(runningDependents)) != 0) {
            return new java.util.ArrayList<java.lang.Runnable>();
        }
        tasks = new java.util.ArrayList<java.lang.Runnable>();
        transition(tasks);
        asyncTasks += tasks.size();
        updateStabilityState(leavingRestState);
    }
    return tasks;
}