private void stopNotificationPump() {
    if ((this.pump) != null) {
        this.pump.stop();
        this.pump = null;
    }
}