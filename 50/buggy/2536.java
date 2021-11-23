public void shoot(android.view.View view) {
    if (!(started)) {
        started = true;
        unmark();
        startGame();
    }
    g.pShoot();
}