private void updateBounds() {
    int paddingLeft = getPaddingLeft();
    int paddingTop = getPaddingTop();
    bounds = new android.graphics.RectF((paddingLeft + (thickness)), (paddingTop + (thickness)), (((size) - paddingLeft) - (thickness)), (((size) - paddingTop) - (thickness)));
}