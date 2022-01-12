@java.lang.Override
public void run() {
    if (listener != null) {
        listener.onConnectionStatusChanged(null, tempPort);
    }
}