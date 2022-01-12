private void moveVisualZone() {
    final float dx = (touch.x) - (down.x);
    moveDis += dx;
    int length = ((int) ((moveDis) / ((com.alex.develop.ui.Config.getItemWidth()) + (com.alex.develop.ui.Config.getItemSpace()))));
    if (1 <= length) {
        stock.moveCursor(length);
        updateParameters();
        moveDis = 0;
    }
    down.x = touch.x;
}