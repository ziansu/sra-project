@java.lang.Override
public void onJobFinished() {
    android.util.Log.e(com.example.dscs.StartFragment.TAG, ("onJobFinished: " + (mBinder)));
    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            refreshButtonState(true);
        }
    });
}