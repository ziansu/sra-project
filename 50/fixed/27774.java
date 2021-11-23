@java.lang.Override
public void onConnectionFailure(int error, java.lang.String reason) {
    notifyFailure(this, new java.io.IOException(java.lang.String.format("%d/%s", error, reason)));
    close(error, reason, Callback.NOOP);
}