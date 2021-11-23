public void moveCameraVertically(com.agonia.game.input.Direction direction, float newY) {
    float playerY = newY + 20;
    if ((playerY >= ((com.agonia.game.Agonia.WINDOW_HEIGHT) / 2)) && (playerY <= ((com.agonia.game.map.GameMap.MAP_HEIGHT) - ((com.agonia.game.Agonia.WINDOW_HEIGHT) / 2)))) {
        if (direction.equals(Direction.NORTH))
            camera.position.y = playerY;
        else
            camera.position.y = playerY;
        
        camera.update();
    }
}