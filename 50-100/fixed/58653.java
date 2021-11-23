private boolean isChildVisible(@javax.annotation.Nonnull
android.view.View child) {
    int height = getHeight();
    int containerTop = getScrollY();
    int containerBottom = containerTop + height;
    int viewTop = child.getTop();
    int viewBottom = child.getBottom();
    return ((viewTop >= containerTop) && (viewBottom <= containerBottom)) || ((child.getHeight()) >= height);
}