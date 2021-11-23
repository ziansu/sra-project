protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    synchronized(mShutdownLock) {
        android.util.Log.d(com.mattrayner.vuforia.app.ApplicationSession.LOGTAG, ("Session License: " + (mLicenseKey)));
        com.vuforia.Vuforia.setInitParameters(mActivity, mVuforiaFlags, mLicenseKey);
        do {
            mProgressValue = com.vuforia.Vuforia.init();
            publishProgress(mProgressValue);
        } while (((!(isCancelled())) && ((mProgressValue) >= 0)) && ((mProgressValue) < 100) );
        return (mProgressValue) > 0;
    }
}