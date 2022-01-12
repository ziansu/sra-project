public void moveSnake(java.util.LinkedList<Location> body) {
    for (int i = 0; i < (body.size()); i++) {
        Location current = body.get(i);
        int x = current.getX();
        int y = current.getY();
        decorateButton(pixels[y][x], java.awt.Color.BLACK);
    }
}