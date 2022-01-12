private void runChildren(final org.junit.runner.notification.RunNotifier notifier, java.util.Collection<T> filteredChildren) {
    final org.junit.runners.model.RunnerScheduler scheduler = fScheduler;
    try {
        for (final T each : filteredChildren) {
            scheduler.schedule(new java.lang.Runnable() {
                public void run() {
                    org.junit.runners.ParentRunner.this.runChild(each, notifier);
                }
            });
        }
    } finally {
        scheduler.finished();
    }
}