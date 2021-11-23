public <T> me.mneri.eloop.Emitter once(final java.lang.String event, final me.mneri.eloop.Callback<T> callback) {
    if (!(isEventLoopThread()))
        throw new me.mneri.eloop.NotOnEventLoopThreadException("once(String, Callback)");
    
    return on(event, new me.mneri.eloop.Callback<T>() {
        @java.lang.Override
        public void run(T data) {
            runCallback(callback, event, data);
            off(event, this);
        }
    });
}