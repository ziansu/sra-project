void finishRetain() {
    if (mInfoRetaining) {
        if (DEBUG)
            com.mobilesolutionworks.android.app.LOGGER.fine(("  Finished Retaining: " + (this)));
        
        mInfoRetaining = false;
        if ((mInfoStarted) != (mInfoRetainingStarted)) {
            if (!(mInfoStarted)) {
                stop();
            }
        }
    }
    if ((mInfoStarted) && (!(mInfoReportNextStart))) {
        callOnLoadFinished(mLoader);
    }
}