private void showFooterView() {
    if ((mFooterView) == null) {
        mFooterView = new com.bboylin.awesomelistview.LoadMoreListViewFooter(getContext());
    }
    if ((getFooterViewsCount()) == 0) {
        addFooterView(mFooterView);
    }
    mFooterView.setPadding(0, 0, 0, 0);
}