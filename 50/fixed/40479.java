public void disconnect() {
    this.nativeDisconnect();
    this.colorPoll.cancel(false);
}