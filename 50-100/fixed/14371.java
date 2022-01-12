com.github.alemures.fasttcp.Emitter on(java.lang.String event, com.github.alemures.fasttcp.Emitter.Listener fn) {
    java.util.LinkedList<com.github.alemures.fasttcp.Emitter.Listener> callbacks = this.callbacks.get(event);
    if (callbacks == null) {
        callbacks = new java.util.LinkedList<>();
    }
    callbacks.add(fn);
    return this;
}