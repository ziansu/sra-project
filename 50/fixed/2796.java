@java.lang.Override
public void onNetworkError(java.lang.Exception e) {
    org.matrix.androidsdk.util.Log.e(im.vector.util.VectorCallManager.LOG_TAG, ("## startIpCall(): onNetworkError Msg=" + (e.getMessage())));
    callback.onStartCallFailed(e.getLocalizedMessage(), null);
}