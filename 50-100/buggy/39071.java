public java.lang.String getReturnValue() {
    returnValue = "";
    try {
        if ((compileLatch.await(1, java.util.concurrent.TimeUnit.SECONDS)) == false) {
            android.util.Log.e(com.lolboxen.ni.NIWebView.NI_LOG_TAG, "script did not compile");
            return returnValue;
        }
    } catch (java.lang.InterruptedException e) {
        return returnValue;
    }
    try {
        finishLatch.await(30, java.util.concurrent.TimeUnit.SECONDS);
        return returnValue;
    } catch (java.lang.InterruptedException e) {
        android.util.Log.e(com.lolboxen.ni.NIWebView.NI_LOG_TAG, "Timed out waiting for JS response");
        throw new java.lang.RuntimeException("Timed out waiting for JS response");
    }
}