@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    shouldIntercept(e);
    if ((mIntercept) && ((mHeaderClickListener) != null)) {
        if ((((mTmpClickId) == (com.oushangfeng.pinnedsectionitemdecoration.callback.OnItemTouchListener.HEADER_ID)) && (!(mDisableHeaderClick))) || ((mTmpClickId) != (com.oushangfeng.pinnedsectionitemdecoration.callback.OnItemTouchListener.HEADER_ID))) {
            mHeaderClickListener.onHeaderLongClick(mTmpClickId, mPosition, mClickHeaderInfo);
        }
    }
}