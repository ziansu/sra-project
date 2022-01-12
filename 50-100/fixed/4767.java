public void abort(java.lang.String error) {
    android.util.Log.d(org.mozilla.gecko.sync.setup.jpake.JpakeClient.LOG_TAG, "aborting...");
    finished = true;
    if (error == null) {
        error = org.mozilla.gecko.sync.setup.Constants.JPAKE_ERROR_USERABORT;
    }
    android.util.Log.d(org.mozilla.gecko.sync.setup.jpake.JpakeClient.LOG_TAG, error);
    if (((Constants.JPAKE_ERROR_CHANNEL.equals(error)) || (Constants.JPAKE_ERROR_NETWORK.equals(error))) || (Constants.JPAKE_ERROR_NODATA.equals(error))) {
    }else {
        reportFailure(error);
    }
    ssActivity.displayAbort(error);
    finished = true;
}