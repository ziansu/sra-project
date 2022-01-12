@java.lang.Override
public void ensureCoreConnections() {
    if (isClosed())
        return ;
    
    if ((open.compareAndSet(false, true)) && (scheduledForCreation.compareAndSet(false, true))) {
        manager.blockingExecutor().submit(newConnectionTask);
    }
}