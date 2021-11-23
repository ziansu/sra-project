private void runCleanupTasks() {
    synchronized(this.cleanupTasks) {
        for (java.lang.Runnable task : this.cleanupTasks) {
            task.run();
        }
    }
}