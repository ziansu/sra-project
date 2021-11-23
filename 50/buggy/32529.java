public void actionPerformed(java.awt.event.ActionEvent e) {
    setTitle("Disconnected");
    connector.disconnect();
    redirector.stop();
    if ((sequencer) != null) {
        sequencer.stop();
        sequencer = null;
    }
}