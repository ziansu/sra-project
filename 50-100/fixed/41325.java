@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        statusLabel.setText("Looking for host...");
        serverAddress = java.net.InetAddress.getByName(ipTextField.getText());
        statusLabel.setText(("Found host " + (serverAddress.toString())));
    } catch (java.net.UnknownHostException e1) {
    }
    connectButton.setBackground(java.awt.Color.GREEN);
    sender.sendConnect(playerTextField.getText());
}