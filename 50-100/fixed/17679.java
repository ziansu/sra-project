void start() {
    if (started)
        return ;
    
    started = true;
    try {
        result = doWork();
    } catch (org.robolectric.shadows.OperationCanceledException | java.io.IOException | org.robolectric.shadows.AuthenticatorException e) {
        exception = e;
    }
    if ((callback) != null) {
        handler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                callback.run(org.robolectric.shadows.ShadowAccountManager.BaseRoboAccountManagerFuture.this);
            }
        });
    }
}