public void setBorderWidth(float borderWidth) {
    this.borderWidth = borderWidth;
    this.borderPaint.setStrokeWidth(borderWidth);
    this.shadowPaint.setShadowLayer(shadowRadius, 2.0F, 2.0F, this.shadowColor);
    this.invalidate();
}