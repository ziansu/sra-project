public <T> me.mneri.eloop.Emitter once(final java.lang.String event, final me.mneri.eloop.Callback<T> callback) {
    if (!(isEventLoopThread()))
        throw new me.mneri.eloop.NotOnEventLoopThreadException("once(String, Callback)");
    
    return on(event, new me.mneri.eloop.Callback() {
        @java.lang.Override
        public void run(java.lang.Object data) {
            runCallback(callback, event, data);
            off(event, this);
        }
    });
}