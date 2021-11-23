@java.lang.Override
public void onConnectionEnd() {
    timers.getFirst().cancel();
    timers.getFirst().purge();
    timers.removeFirst();
    connectButton.setText("Connect");
    startButton.setEnabled(false);
    serverStatusLabel.setText("disconnected");
    if (onDemandCheckBox.isSelected()) {
        connectButtonActionPerformed(null);
    }
}