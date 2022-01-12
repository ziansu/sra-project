private void moveHoverCell(float x, float y) {
    int w = mHoverCell.getWidth();
    int h = mHoverCell.getHeight();
    int top = mHoverCell.getTop();
    int left = mHoverCell.getLeft();
    mHoverCell.setTranslationX((x - (left + (w / 2))));
    mHoverCell.setTranslationY((y - (top + (h / 2))));
}