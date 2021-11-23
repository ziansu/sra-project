@java.lang.Override
public void onClosed(int code, java.lang.String reason) {
    if (!(isVisible())) {
        return ;
    }
    updateConsole(getString(R.string.connection_closed), MessageAdapter.Type.OTHER);
    new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if ((mActivityProxy) != null) {
                mActivityProxy.onDisconnected();
            }
        }
    }, 1000);
}