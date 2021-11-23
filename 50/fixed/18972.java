public void close() {
    this.mConnectionThread.cancel();
}