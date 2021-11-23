private void runCleanupTasks() {
    for (java.lang.Runnable task : this.cleanupTasks) {
        task.run();
    }
}