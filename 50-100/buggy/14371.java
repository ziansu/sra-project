com.github.alemures.fasttcp.Emitter on(java.lang.String event, com.github.alemures.fasttcp.Emitter.Listener fn) {
    java.util.LinkedList<com.github.alemures.fasttcp.Emitter.Listener> callbacks = this.callbacks.get(event);
    if (callbacks == null) {
        callbacks = new java.util.LinkedList<>();
        java.util.LinkedList<com.github.alemures.fasttcp.Emitter.Listener> tempCallbacks = this.callbacks.putIfAbsent(event, callbacks);
        if (tempCallbacks != null) {
            callbacks = tempCallbacks;
        }
    }
    callbacks.add(fn);
    return this;
}