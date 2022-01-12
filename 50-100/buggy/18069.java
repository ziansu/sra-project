private void maybeStartLoading() {
    if (((loadingFinished) || ((state) != (com.google.android.exoplayer.SingleSampleSource.STATE_END_OF_STREAM))) || (loader.isLoading())) {
        return ;
    }
    if ((currentLoadableException) != null) {
        long elapsedMillis = (android.os.SystemClock.elapsedRealtime()) - (currentLoadableExceptionTimestamp);
        if (elapsedMillis < (getRetryDelayMillis(currentLoadableExceptionCount))) {
            return ;
        }
        currentLoadableException = null;
    }
    loader.startLoading(this, this);
}