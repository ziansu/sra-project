public static void loseALife() {
    com.pacman.Services.ProgressKeeper.lives -= 1;
    if ((com.pacman.Services.ProgressKeeper.lives) < 0) {
        com.pacman.gameObjects.Map.resetMap();
    }
}