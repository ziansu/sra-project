public void moveCameraVertically(float newY) {
    float playerY = newY + 20;
    if ((playerY >= ((com.agonia.game.Agonia.WINDOW_HEIGHT) / 2)) && (playerY <= ((com.agonia.game.map.GameMap.MAP_HEIGHT) - ((com.agonia.game.Agonia.WINDOW_HEIGHT) / 2)))) {
        camera.position.y = ((float) (java.lang.Math.round(playerY)));
        camera.update();
    }
}