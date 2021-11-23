@java.lang.Override
public synchronized void close() throws org.elasticsearch.ElasticsearchException {
    if ((closed) == false) {
        closed = true;
        try {
            org.elasticsearch.index.engine.internal.InternalEngine currentEngine = this.currentEngine.getAndSet(null);
            if (currentEngine != null) {
                currentEngine.close();
            }
            mergeScheduler.removeFailureListener(mergeSchedulerFailureListener);
            mergeScheduler.removeListener(mergeSchedulerListener);
            indexSettingsService.removeListener(settingsListener);
        } finally {
            store.decRef();
        }
    }
}