@java.lang.Override
public boolean cancel(boolean mayInterruptIfRunning) {
    if (!(super.cancel(mayInterruptIfRunning)))
        return false;
    
    handler.cancel();
    return true;
}