private void setRectangleOnButton(float x, float y) {
    int xx = java.lang.Math.round(x);
    int yy = java.lang.Math.round(y);
    this.buttonArea = new android.graphics.Rect(xx, yy, (xx + (currentlyDisplayed.getWidth())), (yy + (currentlyDisplayed.getHeight())));
}