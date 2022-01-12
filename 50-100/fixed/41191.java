@java.lang.Override
public boolean cancel(boolean mayInterruptIfRunning) {
    if ((state.get()) == (FutureImpl.States.CANCELED))
        return true;
    
    if (state.compareAndSet(FutureImpl.States.NEW, FutureImpl.States.CANCELED)) {
        return true;
    }else
        if (mayInterruptIfRunning) {
            while ((runningThread) == null);
            try {
                runningThread.interrupt();
            } finally {
                state.set(FutureImpl.States.CANCELED);
            }
            return true;
        }
    
    return false;
}