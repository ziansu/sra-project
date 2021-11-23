@java.lang.Override
public void run() {
    if (!(mGotLocation)) {
        mActivity.runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                mListener.onLocationNotAvailable();
            }
        });
    }
}