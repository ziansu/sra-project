private boolean mouseOverExtendButton(int x, int y, int cx, int cy) {
    return (((x > ((cx + (win.getWidth())) - 10)) && (x < ((cx + (win.getWidth())) - 2))) && (y > (cy + 2))) && (y < (cy + 10));
}