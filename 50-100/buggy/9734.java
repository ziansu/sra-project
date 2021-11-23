public void keyPressed(java.awt.event.KeyEvent keyPressed) {
    if ((keyPressed.getKeyCode()) == (java.awt.event.KeyEvent.VK_ENTER)) {
        command = inArea.getText();
        inArea.setText("");
        tcpService.sendCommand(command.trim());
    }
}