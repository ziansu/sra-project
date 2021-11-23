@java.lang.Override
public void draw(android.graphics.Canvas canvas, android.graphics.Paint paint, float opacity) {
    opacity *= mOpacity;
    if (opacity > (MIN_OPACITY_FOR_DRAW)) {
        saveAndSetupCanvas(canvas);
        if ((mPath) == null) {
            throw new com.facebook.react.bridge.JSApplicationIllegalArgumentException("Shapes should have a valid path (d) prop");
        }
        if (setupStrokePaint(paint, opacity)) {
            canvas.drawPath(mPath, paint);
        }
        if (setupFillPaint(paint, opacity)) {
            canvas.drawPath(mPath, paint);
        }
        restoreCanvas(canvas);
    }
    markUpdateSeen();
}