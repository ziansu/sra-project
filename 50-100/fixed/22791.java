@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    if ((mScrollFlag) && (firstVisibleItem > 0)) {
        if (firstVisibleItem > (mLastVisibleItemPosition)) {
            mBackTopIv.setVisibility(View.VISIBLE);
        }else
            if (firstVisibleItem < (mLastVisibleItemPosition)) {
            }else {
                return ;
            }
        
        mLastVisibleItemPosition = firstVisibleItem;
    }
    if (firstVisibleItem == 0) {
        mBackTopIv.setVisibility(View.GONE);
    }
}