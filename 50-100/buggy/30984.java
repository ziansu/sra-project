private void endGame() {
    if (((sh.getProgress()) / 1000) < 5000) {
        sql.addPlaydata(sh.getCurrentSong(), sh.getCurrentSongInstance(), ((sh.getProgress()) / 1000), enemies_missed, enemies_hit, buttons_pressed, joystick_moved);
        sh.getCurrentSongInstance().played();
    }
    if ((model.gameState.PlayState.currentScore) == 0)
        gsm.setState(State.MENU_STATE);
    else
        gsm.setState(State.GAMEOVER_STATE);
    
}