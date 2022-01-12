public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String location = BattleshipsGamePanel.controlLocationLabel.getText();
    if (isMyTurn) {
        battleshipsCommandObject.sendCommand("shot");
        sendShot(location);
    }else {
        battleLog.append("It is not your turn!\n");
    }
}