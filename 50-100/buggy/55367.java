@java.lang.Override
public boolean onTouchStart(float x, float y) {
    canvas = image.getSelectedCanvas();
    if ((canvas) == null)
        return false;
    
    updateClipping();
    colors = image.getColorsSet();
    paint.setAlpha(((int) ((opacity) * 255)));
    paint.setStrokeWidth(size);
    updateShader();
    path.reset();
    path.moveTo(x, y);
    lastX = x;
    lastY = y;
    return true;
}