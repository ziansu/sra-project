public boolean contains(gamemodel.ScreenComponent comp, int x, int y) {
    return (((x >= 0) && (y >= 0)) && ((x + (comp.getWidth())) <= ((getWidth()) + 1))) && ((y + (comp.getWidth())) <= ((getHeight()) + 1));
}