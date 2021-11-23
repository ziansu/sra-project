private void drawRipple(android.graphics.Canvas canvas) {
    ripplePaint.setAlpha(rippleAlpha);
    canvas.drawCircle(xPos, yPos, rippleRadius, ripplePaint);
}