@java.lang.Override
public void onConnectionEnd() {
    connectButton.setText("Connect");
    if (onDemandCheckBox.isSelected()) {
        connectButtonActionPerformed(null);
    }
    startButton.setEnabled(false);
    serverStatusLabel.setText("disconnected");
    timer.cancel();
    timer.purge();
}