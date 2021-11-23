private int getScrollAmount(android.view.ViewGroup viewGroup) {
    int i = findPositionForTopFullyVisibleView(viewGroup);
    android.view.View viewItself = viewGroup.getChildAt(i);
    android.view.View viewAfter = (i == 0) ? viewGroup.getChildAt(1) : viewGroup.getChildAt((i + 1));
    if (viewAfter == null) {
        return viewItself == null ? 0 : viewItself.getTop();
    }
    return (viewAfter.getTop()) - ((viewGroup.getPaddingTop()) / 2);
}