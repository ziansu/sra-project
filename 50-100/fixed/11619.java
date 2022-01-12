private void labelCpuInventory() {
    if (game.getCpu())
        if ((game.getCpuPlayer()) == (Player.BLUE)) {
            blueInvLabel.setVisible(true);
            redInvLabel.setVisible(false);
        }else {
            blueInvLabel.setVisible(false);
            redInvLabel.setVisible(true);
        }
    else {
        blueInvLabel.setVisible(false);
        redInvLabel.setVisible(false);
    }
}