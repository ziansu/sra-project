final void stop() {
    synchronized(lock) {
        if ((currentTask) != null) {
            stopwatch.stop();
            currentTask.state.cancelled = true;
        }
    }
}