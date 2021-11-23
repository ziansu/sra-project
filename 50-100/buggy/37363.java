@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    if ((mIntercept) && ((mHeaderClickListener) != null)) {
        if ((((mTmpClickId) == (com.oushangfeng.pinnedsectionitemdecoration.callback.OnItemTouchListener.HEADER_ID)) && (!(mDisableHeaderClick))) || ((mTmpClickId) != (com.oushangfeng.pinnedsectionitemdecoration.callback.OnItemTouchListener.HEADER_ID))) {
            mHeaderClickListener.onHeaderClick(mTmpClickId, mPosition, mClickHeaderInfo);
        }
    }
    return super.onSingleTapConfirmed(e);
}