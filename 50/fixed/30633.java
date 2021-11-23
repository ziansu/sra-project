public void addResultListener(com.podio.sdk.Request.ResultListener<T> listener, boolean deliverResultNow, T result) {
    if (listener != null) {
        if (deliverResultNow) {
            listener.onRequestPerformed(result);
        }else {
            resultListeners.add(listener);
        }
    }
}