public void addErrorListener(com.podio.sdk.Request.ErrorListener listener, boolean deliverErrorNow, java.lang.Throwable error) {
    if (listener != null) {
        errorListeners.add(listener);
        if (deliverErrorNow) {
            listener.onErrorOccured(error);
        }
    }
}