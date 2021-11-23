@java.lang.Override
protected void onPostExecute(java.lang.Object result) {
    bIsRunning = false;
    if ((listener) != null) {
        listener.onDone(name);
    }
    if (((asyncCallback) != null) && (hasSentResult)) {
        hasSentResult = false;
        asyncCallback.onResult(err, rs);
    }
}