public void removeListener(io.grpc.Context.CancellationListener cancellationListener) {
    synchronized(this) {
        if ((listeners) != null) {
            for (int i = (listeners.size()) - 1; i >= 0; i--) {
                if ((listeners.get(i).listener) == cancellationListener) {
                    listeners.remove(i);
                    break;
                }
            }
            if (listeners.isEmpty()) {
                parent.removeListener(parentListener);
                listeners = null;
            }
        }
    }
}