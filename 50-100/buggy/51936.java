public void stop() {
    if (this._isActive.compareAndSet(true, false)) {
        this._treecache.close();
        this._executor.submit(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                _listenerSupport.foreachComponent(new rx.functions.Action1<org.jocean.j2se.zk.ZKAgent.Listener>() {
                    @java.lang.Override
                    public void call(final org.jocean.j2se.zk.ZKAgent.Listener listener) {
                        syncNodesOnRemoved(listener);
                    }
                });
                _listenerSupport.clear();
            }
        });
    }else {
        org.jocean.j2se.zk.ZKAgent.LOG.warn("ZKAgent has already stopped.");
    }
}