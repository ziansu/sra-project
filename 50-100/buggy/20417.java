@java.lang.Override
public org.apache.twill.common.Cancellable addConnectionWatcher(org.apache.zookeeper.Watcher watcher) {
    if (watcher == null) {
        return new org.apache.twill.common.Cancellable() {
            @java.lang.Override
            public void cancel() {
            }
        };
    }
    final org.apache.zookeeper.Watcher wrappedWatcher = wrapWatcher(watcher);
    connectionWatchers.add(wrappedWatcher);
    return new org.apache.twill.common.Cancellable() {
        @java.lang.Override
        public void cancel() {
            connectionWatchers.remove(wrappedWatcher);
        }
    };
}