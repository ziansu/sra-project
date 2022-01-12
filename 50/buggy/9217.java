public void tick(game.Game game) {
    if (Game.key.left) {
        x += 5;
    }
    if (Game.key.right) {
        x -= 5;
    }
}