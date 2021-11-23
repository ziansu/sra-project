public void startPing() {
    pingTimer = new javax.swing.Timer(org.montsuqi.monsiaj.client.Client.PING_TIMER_PERIOD, (java.awt.event.ActionEvent e) -> {
        sendPing();
    });
    pingTimer.start();
}