private void stopTicker() {
    unregisterReceiver(receiver);
    ticker.cancel(true);
    receiverRegistered = false;
}