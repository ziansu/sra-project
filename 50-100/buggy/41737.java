public void processMessageFromNetwork(final java.lang.String inputString) {
    if (inputString.equals(com.mygdx.game.main_controler.Controler.OTHER_PLAYER_ROLLED_DICE_MESSAGE)) {
        this.setChanged();
        com.mygdx.game.game.Player playerTwo = com.mygdx.game.main_controler.Controler.gameField.getPlayer(Player.PLAYER_TWO_ID);
        movement(playerTwo, com.mygdx.game.GUI.Main.getDice());
        com.mygdx.game.main_controler.Controler.diceSprite = com.mygdx.game.GUI.Main.getDiceSprite();
        com.mygdx.game.main_controler.Controler.diceSprite.setTexture(com.mygdx.game.GUI.Main.getDice().getDiceTexture());
        com.mygdx.game.GUI.Main.setDiceAnimationTrue();
        com.mygdx.game.main_controler.Controler.playerOneTurn = true;
        com.mygdx.game.main_controler.Controler.camera.update();
    }
}