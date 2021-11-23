public void moveSnake(java.util.LinkedList<Location> body) {
    while (!(body.isEmpty())) {
        Location current = body.remove();
        int x = current.getX();
        int y = current.getY();
        decorateButton(pixels[x][y], java.awt.Color.BLACK);
    } 
}