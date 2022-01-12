<T> com.hazelcast.core.ExecutionCallback<T> newOnGetCallback(final long startNanos) {
    return new com.hazelcast.core.ExecutionCallback() {
        @java.lang.Override
        public void onResponse(java.lang.Object response) {
            onGet(startNanos, (response != null));
        }

        @java.lang.Override
        public void onFailure(java.lang.Throwable t) {
        }
    };
}