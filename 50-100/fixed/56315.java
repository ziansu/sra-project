@java.lang.Override
public void run() {
    while (!(isTerminated)) {
        try {
            org.rmatil.sync.event.aggregator.core.events.IEvent headEvent = this.eventQueue.take();
            this.fileSyncer.sync(headEvent);
        } catch (java.lang.InterruptedException e) {
            org.rmatil.sync.core.syncer.file.SyncFileChangeListener.logger.info("Got interrupted. Stopping to listen for file change events. FileSyncer will therefore not sync any change until this listener is restarted.");
            this.isTerminated = true;
        } catch (java.lang.Exception e) {
            org.rmatil.sync.core.syncer.file.SyncFileChangeListener.logger.error(("Error in SyncFileChangeListener Thread. Message: " + (e.getMessage())), e);
        }
    } 
}