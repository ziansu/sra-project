void start() {
    if (started)
        return ;
    
    started = true;
    handler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                result = doWork();
            } catch (org.robolectric.shadows.OperationCanceledException | java.io.IOException | org.robolectric.shadows.AuthenticatorException e) {
                exception = e;
            }
            if ((callback) != null) {
                callback.run(org.robolectric.shadows.ShadowAccountManager.BaseRoboAccountManagerFuture.this);
            }
        }
    });
}