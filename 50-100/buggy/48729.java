public void keyPressed(int k) {
    player.keyPressed(k);
    if (k == (GameStateManager.reset)) {
        Main.SoundPlayer.stopLoopingClip(0);
        gsm.setState(GameStateManager.MENUSTATE);
        gsm.resetState(GameStateManager.BOSS1STATE);
    }
    if (k == (GameStateManager.pause)) {
        start = false;
    }
    if (k == (GameStateManager.select)) {
        start = true;
    }
}