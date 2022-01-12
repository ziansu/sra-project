@java.lang.Override
public void setLoadMoreView(android.view.View view) {
    if ((mViewGroup) == null) {
        mFooterView = view;
        return ;
    }
    if (((mFooterView) != null) && ((mFooterView) != view)) {
        removeFooterView(mFooterView);
    }
    mFooterView = view;
    mFooterView.setOnClickListener(new com.being.base.ui.widget.ptr.loadmore.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            tryToPerformLoadMore();
        }
    });
    addFooterView(view);
}