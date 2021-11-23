public void sleep(long delayMillis) {
    this.removeMessages(0);
    sendMessageDelayed(obtainMessage(0), delayMillis);
}