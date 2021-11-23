@java.lang.Override
public void onFilterClick(int position) {
    filterPosition = position;
    isSmooth = true;
    smoothListView.smoothScrollToPositionFromTop(filterViewPosition, com.sunfusheng.StickyHeaderListView.util.DensityUtil.dip2px(mContext, titleViewHeight));
}