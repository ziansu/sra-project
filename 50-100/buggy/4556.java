private void step() {
    if ((player) == null)
        player = view.GameFrame.getInstance().getSnake();
    
    player.setLookingDirection(dir);
    player.move();
    view.GameFrame.getInstance().repaintGameCanvas();
}