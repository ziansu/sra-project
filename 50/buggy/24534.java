protected void notifyErrorProcess(java.lang.String line) {
    this.hasError = true;
    synchronized(listeners) {
        for (ts.nodejs.INodejsProcessListener listener : listeners) {
            listener.onError(this, line);
        }
    }
}