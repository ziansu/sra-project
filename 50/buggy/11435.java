@java.lang.Override
public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    mPaint.setColorFilter(colorFilter);
    invalidateSelf();
}