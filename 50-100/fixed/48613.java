private void moveHoverCell(float x, float y) {
    int w = mHoverCell.getWidth();
    int h = mHoverCell.getHeight();
    int top = mHoverCell.getTop();
    int left = mHoverCell.getLeft();
    mHoverCell.setTranslationX((x - (w / 2)));
    mHoverCell.setTranslationY((y - (h / 2)));
}