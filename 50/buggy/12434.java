@java.lang.Override
public void draw(android.graphics.Canvas canvas) {
    canvas.save();
    drawBackground(canvas, mPaint);
    drawCenterDrawable(canvas, mDrawableCenter);
}