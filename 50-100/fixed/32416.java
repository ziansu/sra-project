public void setDrawingRect(float left, float top, float right, float bottom) {
    this.drawRect.left = left;
    this.drawRect.top = top;
    this.drawRect.right = right;
    this.drawRect.bottom = bottom;
    if (this.isDebug) {
        this.inValidate();
    }
}