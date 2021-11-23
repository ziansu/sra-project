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
        tmpListeners.get(i).deliver();
    }
    parent.removeListener(parentListener);
}