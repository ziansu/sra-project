public void addResultListener(com.podio.sdk.Request.ResultListener<T> listener, boolean deliverResultNow, T result) {
    if (listener != null) {
        resultListeners.add(listener);
        if (deliverResultNow) {
            listener.onRequestPerformed(result);
        }
    }
}