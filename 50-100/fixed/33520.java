private void moveVisualZone() {
    final float dx = (touch.x) - (down.x);
    moveDis += dx;
    int length = ((int) ((-dx) / ((com.alex.develop.ui.Config.getItemWidth()) + (com.alex.develop.ui.Config.getItemSpace()))));
    stock.moveCursor(length);
    updateParameters();
}