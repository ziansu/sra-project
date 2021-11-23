private void jToggleButtonSelectActionPerformed(java.awt.event.ActionEvent evt) {
    character.PlayerCharacter pc = ((character.PlayerCharacter) (jList1.getSelectedValue()));
    if (pc != null) {
        this.setVisible(false);
        main.Game game = main.Game.getInstance();
        game.start();
    }
}