public void close() {
    this.mConnectionThread.cancel();
    this.mListener.onConnectionLost();
}