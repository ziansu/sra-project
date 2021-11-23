public void destroyLock() {
    this.masterActivity.unregisterReceiver(this.timeChangedReceiver);
}