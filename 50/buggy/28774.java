public void addFooterView(android.view.View view) {
    if (view == null) {
        throw new java.lang.RuntimeException("footer is null");
    }
    if ((getFooterViewsCount()) > 0) {
        removeFooterView(getFooterView());
    }
    mFooterViews.add(view);
}