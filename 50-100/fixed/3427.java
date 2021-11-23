void drawBarBackground(android.graphics.Canvas canvas, float left, float top, float right, float bottom) {
    canvas.drawRoundRect(new android.graphics.RectF(java.lang.Math.round(left), java.lang.Math.round(top), java.lang.Math.round(right), java.lang.Math.round(bottom)), style.cornerRadius, style.cornerRadius, style.barBackgroundPaint);
}