protected boolean mouseOverSlider(int x, int y, int cx, int cy) {
    return (((x > (slide)) && (x < ((slide) + 15))) && (y > cy)) && (y < (cy + (panel.getHeight())));
}