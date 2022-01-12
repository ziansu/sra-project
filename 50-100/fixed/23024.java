public void moveCameraHorizontally(float newX) {
    float playerX = newX + 20;
    if ((playerX <= ((com.agonia.game.map.GameMap.MAP_WIDTH) - ((com.agonia.game.Agonia.WINDOW_WIDTH) / 2))) && (playerX >= ((com.agonia.game.Agonia.WINDOW_WIDTH) / 2))) {
        camera.position.x = ((float) (java.lang.Math.round(playerX)));
        camera.update();
    }
}