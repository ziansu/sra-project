protected void notifyErrorProcess(java.lang.String line) {
    synchronized(listeners) {
        for (ts.nodejs.INodejsProcessListener listener : listeners) {
            listener.onError(this, line);
        }
    }
}