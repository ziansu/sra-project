public void sleep(long delayMillis) {
    removeMessages(0);
    sendMessageDelayed(obtainMessage(0), delayMillis);
}