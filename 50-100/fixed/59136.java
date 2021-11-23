@java.lang.Override
public void run() {
    try {
        doRun();
        if (!(cancelled.get()))
            lifecycleListener.onShutdown(id);
        
    } catch (java.lang.Throwable t) {
        if (!(cancelled.get()))
            lifecycleListener.onFailure(id, t);
        
    }
}