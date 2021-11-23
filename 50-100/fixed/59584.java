@java.lang.Override
public void onConnectionEnd() {
    timer.cancel();
    timer.purge();
    connectButton.setText("Connect");
    if (onDemandCheckBox.isSelected()) {
        connectButtonActionPerformed(null);
    }
    startButton.setEnabled(false);
    serverStatusLabel.setText("disconnected");
}