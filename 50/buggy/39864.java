public void setCaptureTime(final float captureMillis) {
    if ((scopeDataListener) != null) {
        scopeDataListener.setCaptureTimeMillis(captureMillis);
    }
}