@java.lang.Override
public boolean cancel(boolean mayInterruptIfRunning) {
    if (!(super.cancel(mayInterruptIfRunning)))
        return false;
    
    if ((handler) != null) {
        handler.cancel();
    }
    return true;
}