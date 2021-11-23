public static void resetGame() {
    Game.gameState = game.Game.STATE.Play;
    Game.deathCount = 0;
    Game.killCount = 0;
    Game.gameScore = 0;
    game.Game.createAsteroids(10);
    game.Game.createPlayer();
}