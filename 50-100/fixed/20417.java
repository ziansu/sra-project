@java.lang.Override
public org.apache.twill.common.Cancellable addConnectionWatcher(final org.apache.zookeeper.Watcher watcher) {
    if (watcher == null) {
        return new org.apache.twill.common.Cancellable() {
            @java.lang.Override
            public void cancel() {
            }
        };
    }
    connectionWatchers.add(watcher);
    return new org.apache.twill.common.Cancellable() {
        @java.lang.Override
        public void cancel() {
            connectionWatchers.remove(watcher);
        }
    };
}