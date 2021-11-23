@java.lang.Override
public void cancelAuthentication(final android.os.IBinder token, java.lang.String opPackageName) {
    if (!(canUseFingerprint(opPackageName, false))) {
        return ;
    }
    mHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            stopAuthentication(token, true);
        }
    });
}