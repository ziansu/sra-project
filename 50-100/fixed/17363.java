private void gameLogic(double delta) {
    playerLogic(delta);
    for (cz.cvut.fel.syrovkar.rpgEngine.Entity e : cz.cvut.fel.syrovkar.rpgEngine.Game.currentLocation.getEntities()) {
        player.collideWith(e, delta);
    }
    for (cz.cvut.fel.syrovkar.rpgEngine.Item i : cz.cvut.fel.syrovkar.rpgEngine.Game.currentLocation.getItems()) {
        player.collideWith(i, delta);
    }
}