void drawBarBackground(android.graphics.Canvas canvas, float left, float top, float right, float bottom) {
    canvas.drawRoundRect(new android.graphics.RectF(((int) (left)), ((int) (top)), ((int) (right)), ((int) (bottom))), style.cornerRadius, style.cornerRadius, style.barBackgroundPaint);
}