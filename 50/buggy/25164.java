public void drawRipple(android.graphics.Canvas canvas) {
    ripplePaint.setStrokeWidth(2);
    ripplePaint.setStyle(Paint.Style.STROKE);
    ripplePaint.setColor(color);
    ripplePaint.setAlpha(rippleAlpha);
    canvas.drawCircle(xPos, yPos, rippleRadius, ripplePaint);
}