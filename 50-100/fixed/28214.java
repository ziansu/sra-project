private void endTurnActionPerformed(java.awt.event.ActionEvent evt) {
    if ((data.players.get(playerNum).getCash()) <= 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "YOU LOSE!");
        data.players.remove(data.players.get(playerNum));
    }
    if ((playerNum) == ((data.players.size()) - 1))
        playerNum = 0;
    else
        playerNum += 1;
    
    canRoll = true;
}