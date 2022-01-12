@java.lang.Override
public void onItemTop(int fromPosition) {
    if ((isHeaderPosition(fromPosition)) || (isFooterPosition(fromPosition))) {
        return ;
    }
    ((baidu.ghostinmatrix.com.pulltorefreshrecyclerview.ItemTouchHelperAdapter) (mInnerAdapter)).onItemTop((fromPosition - (mHeaderViews.size())));
    notifyItemMoved(fromPosition, mHeaderViews.size());
}