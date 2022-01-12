private void step(java.awt.event.MouseEvent e) {
    int index = java.util.Arrays.asList(buttons).indexOf(e.getSource());
    int y = index / (width);
    int x = index % (width);
    game.turn(x, y);
    updateButtons();
}