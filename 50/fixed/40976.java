@java.lang.Override
public void onClose() {
    if (listener != null) {
        listener.onClose();
    }
    mIsConnected.set(false);
}