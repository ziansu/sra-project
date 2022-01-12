private byte snakeDetected(java.awt.Point loc) {
    for (org.snake.Snake s : this.map) {
        if ((s.getHeadLocation().x) == (loc.x)) {
            return 1;
        }
        if ((s.getHeadLocation().y) == (loc.y))
            return 2;
        
    }
    return 0;
}