@java.lang.Override
public void mouseClicked(int x, int y, int cx, int cy) {
    if (mouseOverHeightSlider(x, y, cx, cy)) {
        draggingHeight = true;
    }
    if (mouseOverWidthSlider(x, y, cx, cy)) {
        draggingWidth = true;
    }
}