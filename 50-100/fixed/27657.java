public void sync(java.lang.String token, java.lang.String uid, final com.strongloop.android.loopback.callbacks.VoidCallback callback) {
    com.google.common.collect.ImmutableMap params = com.google.common.collect.ImmutableMap.of("user_token", token, "user_id", uid);
    invokeStaticMethod("sync", params, new com.strongloop.android.remoting.adapters.Adapter.Callback() {
        @java.lang.Override
        public void onSuccess(java.lang.String response) {
            callback.onSuccess();
        }

        @java.lang.Override
        public void onError(java.lang.Throwable t) {
            callback.onError(t);
        }
    });
}