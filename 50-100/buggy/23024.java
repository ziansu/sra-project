public void moveCameraHorizontally(com.agonia.game.input.Direction direction, float newX) {
    float playerX = newX + 20;
    if ((playerX <= ((com.agonia.game.map.GameMap.MAP_WIDTH) - ((com.agonia.game.Agonia.WINDOW_WIDTH) / 2))) && (playerX >= ((com.agonia.game.Agonia.WINDOW_WIDTH) / 2))) {
        if (direction.equals(Direction.EAST))
            camera.position.x = playerX;
        else
            camera.position.x = playerX;
        
        camera.update();
    }
}