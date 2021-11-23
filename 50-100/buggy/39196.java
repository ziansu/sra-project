private void jToggleButtonSelectActionPerformed(java.awt.event.ActionEvent evt) {
    this.setVisible(false);
    character.PlayerCharacter pc = ((character.PlayerCharacter) (jList1.getSelectedValue()));
    if (pc != null) {
        main.Game game = main.Game.getInstance();
        game.start();
    }
}