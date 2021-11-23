public static void loseALife() {
    com.pacman.Services.ProgressKeeper.lives -= 1;
    if ((com.pacman.Services.ProgressKeeper.lives) < 0) {
        com.pacman.Services.ProgressKeeper.resetData();
        com.pacman.gameObjects.Map.resetMap();
    }
}