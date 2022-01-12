@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    bringChildToFront(mMenuButton);
    bringChildToFront(mImageOpenButton);
    bringChildToFront(mImageCloseButton);
    mButtonsCount = (getChildCount()) - 1;
    createLabels();
}