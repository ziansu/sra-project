@java.lang.Override
public boolean cancel(boolean mayInterruptIfRunning) {
    if (state.compareAndSet(FutureImpl.States.NEW, FutureImpl.States.CANCELED)) {
        return true;
    }else
        if (mayInterruptIfRunning) {
            while ((runningThread) == null) {
            } 
            runningThread.interrupt();
            return true;
        }
    
    return false;
}