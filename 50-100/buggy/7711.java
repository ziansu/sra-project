private void advancePlayer() {
    if ((game.currentplayer) == (game.player)) {
        game.currentplayer = game.opponent;
        handleAttack(game.opponent.choseRandomMove(game));
    }else {
        game.currentplayer = game.player;
        menu.setVisible(true);
        infoText.setVisible(false);
    }
}