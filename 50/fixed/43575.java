public void setShadowColor(int shadowColor) {
    this.shadowColor = shadowColor;
    this.shadowPaint.setShadowLayer(shadowRadius, 0.0F, 0.0F, shadowColor);
    this.invalidate();
}