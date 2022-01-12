@java.lang.Override
public void update(float delta) {
    checkPlayerMovementControl(delta);
    checkAndSpawnFallingItem();
    updateFallingItems(delta);
    updateSimpleObjects(delta);
    hud.setPoints(player.getPoints());
    hud.setLives(player.getLives());
    if ((player.getLives()) <= 0) {
        gsm.setState(new com.zolotukhin.picturegame.state.GameOverState(gsm));
    }
}