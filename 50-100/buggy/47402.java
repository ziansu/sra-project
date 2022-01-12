@java.lang.Override
public void update(float delta) {
    if (!(player.isAlive())) {
        setCurrentState(new com.ecam.tatchi.state.GameOverState(((playerScore) / 100)));
    }
    playerScore += 1;
    if ((((playerScore) % 500) == 0) && ((enemySpeed) < 1000)) {
        enemySpeed *= 1.5;
        shootSpeed = (enemySpeed) * 2;
        enemyShootFrequency *= 0.8;
    }
    player.update(delta);
    updateEnemys(delta);
    updateLasers(delta);
}