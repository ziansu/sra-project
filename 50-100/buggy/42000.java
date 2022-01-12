@java.lang.Override
public void onConnectionEnd() {
    timers.getFirst().cancel();
    timers.getFirst().purge();
    timers.removeFirst();
    connectButton.setText("Connect");
    if (onDemandCheckBox.isSelected()) {
        connectButtonActionPerformed(null);
    }
    startButton.setEnabled(false);
    serverStatusLabel.setText("disconnected");
}