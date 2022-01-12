private void step(java.awt.event.MouseEvent e) {
    int index = java.util.Arrays.asList(buttons).indexOf(e.getSource());
    int x = index / (width);
    int y = index % (width);
    game.turn(x, y);
    updateButtons();
}