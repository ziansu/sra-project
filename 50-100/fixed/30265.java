private void changeViewAfterConnect() {
    control.view.sendButton.setEnabled(true);
    control.view.sendButton.setContentAreaFilled(true);
    control.view.connectButton.setText("Disconnect");
    control.view.result.append("CONNECTED \n");
    control.setConnected(true);
    control.view.userInput.setText("");
    control.view.tfID.setEnabled(false);
}