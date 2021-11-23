private void updateCanvas(android.graphics.Canvas canvas) {
    drawIcons(canvas);
    drawSelectedIcon(canvas);
    if (!(mIsTouchUp)) {
        return ;
    }
}