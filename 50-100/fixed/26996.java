public boolean canAdd(android.view.View view) {
    int size = mViews.size();
    if (size == 0) {
        return true;
    }
    int viewWidth = view.getMeasuredWidth();
    float planWidth = ((mUsedWidth) + (mHorizontalSpace)) + viewWidth;
    return planWidth <= (mMaxWidth);
}