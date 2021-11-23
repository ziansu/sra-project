@java.lang.Override
public void run() {
    mActivity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (!(mGotLocation))
                mListener.onLocationNotAvailable();
            
        }
    });
}