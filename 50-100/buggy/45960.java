void notifyAndClearListeners() {
    java.util.ArrayList<io.grpc.Context.ExecutableListener> tmpListeners;
    synchronized(this) {
        if ((listeners) == null) {
            return ;
        }
        tmpListeners = listeners;
        listeners = null;
    }
    for (int i = 0; i < (tmpListeners.size()); i++) {
        try {
            tmpListeners.get(i).deliver();
        } catch (java.lang.Throwable t) {
            io.grpc.Context.LOG.log(java.util.logging.Level.INFO, "Exception notifying context listener", t);
        }
    }
    parent.removeListener(parentListener);
}