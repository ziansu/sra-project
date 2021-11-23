@java.lang.Override
public void ensureCoreConnections() {
    if (isClosed())
        return ;
    
    if ((!(open.get())) && (scheduledForCreation.compareAndSet(false, true))) {
        manager.blockingExecutor().submit(newConnectionTask);
    }
}