public void addFooterView(android.view.View view) {
    if (view == null) {
        throw new java.lang.RuntimeException("footer is null");
    }
    removeFooterView();
    mFooterViews.add(view);
}