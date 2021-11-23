private float getFontlength(android.graphics.Paint paint, java.lang.String str) {
    android.graphics.Rect rect = new android.graphics.Rect();
    paint.getTextBounds(str, 0, str.length(), rect);
    return rect.width();
}