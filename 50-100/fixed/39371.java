private void computeKeyboardStartXY() {
    kpStartX = 0;
    kpStartY = (drawableHeight) + (DRAWABLE_PADDING);
    keyWidth = (getMeasuredWidth()) / (KEY_PAD_COLS);
    keyHeight = ((getMeasuredHeight()) - ((drawableHeight) + (DRAWABLE_PADDING))) / (KEY_PAD_ROWS);
    initialiseKeyRects();
}