@java.lang.Override
public void mouseClicked(int x, int y, int cx, int cy) {
    if (mouseOverWidthSlider(x, y, cx, cy)) {
        draggingWidth = true;
    }
    if (mouseOverHeightSlider(x, y, cx, cy)) {
        draggingHeight = true;
    }
}