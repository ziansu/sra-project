@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    android.util.Log.d(com.faith.ctv.ytb.VideoListDemo2Activity.TAG, ((((("滚动状态-->firstVisibleItem = " + firstVisibleItem) + "-->visibleItemCount = ") + visibleItemCount) + "-->totalItemCount = ") + totalItemCount));
    if ((firstVisibleItem <= (mCurrItemPos)) && ((mCurrItemPos) <= (firstVisibleItem + visibleItemCount))) {
        mCurrItemIsVis = true;
    }else {
        mCurrItemIsVis = false;
    }
    android.util.Log.d(com.faith.ctv.ytb.VideoListDemo2Activity.TAG, ("滚动状态-->click item是否可 ＝ " + (mCurrItemIsVis)));
}