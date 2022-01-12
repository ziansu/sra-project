@java.lang.Override
protected void onCancelled() {
    bIsRunning = false;
    if ((listener) != null) {
        listener.onDone(name);
    }
    if ((asyncCallback) != null) {
        asyncCallback.onCancel();
    }
}