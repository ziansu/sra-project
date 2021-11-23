@java.lang.Override
public void onGlobalLayout() {
    if ((height) != (mCategoryGirdView.getHeight())) {
        height = mCategoryGirdView.getHeight();
        calculateVisibleInvisibleHeight();
    }
}