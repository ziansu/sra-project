public void stopTick() {
    if ((this.IntentReceiver) != null) {
        this.context.unregisterReceiver(this.IntentReceiver);
    }
    if ((this.Handler) != null) {
        this.Handler.removeCallbacks(this.Ticker);
    }
}