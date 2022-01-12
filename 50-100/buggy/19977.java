public void loginWithAuthCode(final android.app.Activity activity) {
    stopReplication();
    startPull(new com.couchbase.grocerysync.Application.ReplicationSetupCallback() {
        @java.lang.Override
        public void setup(com.couchbase.lite.replicator.Replication repl) {
            shouldStartPushAfterPullStart = true;
            com.couchbase.lite.auth.OIDCLoginCallback callback = com.couchbase.grocerysync.OpenIDAuthenticator.getOIDCLoginCallback(getApplicationContext());
            repl.setAuthenticator(com.couchbase.lite.auth.OpenIDConnectAuthenticatorFactory.createOpenIDConnectAuthenticator(callback, context));
        }
    });
}