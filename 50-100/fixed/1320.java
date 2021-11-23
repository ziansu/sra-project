public void gameLoop() {
    boolean loop = true;
    while (loop) {
        draw.draw();
        mapCheck.checkPlayer(draw.getMap(), draw.getHeight(), draw.getWidth());
        loop = mapCheck.getLoop();
        if (loop) {
            player.move();
            draw.addPMoveToBoard(player.getY(), player.getX());
        }
    } 
}