private void updateBounds() {
    int paddingLeft = getPaddingLeft();
    int paddingTop = getPaddingTop();
    bounds = new android.graphics.RectF((paddingLeft + ((thickness) / 2)), (paddingTop + ((thickness) / 2)), (((size) + paddingLeft) - ((thickness) / 2)), (((size) + paddingTop) - ((thickness) / 2)));
}