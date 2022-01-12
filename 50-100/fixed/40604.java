@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent e) {
    mDoubleTap = true;
    shouldIntercept(e);
    if (((mIntercept) && ((mHeaderClickListener) != null)) && ((mClickHeaderInfo) != null)) {
        if ((((mTmpClickId) == (com.oushangfeng.pinnedsectionitemdecoration.callback.OnItemTouchListener.HEADER_ID)) && (!(mDisableHeaderClick))) || ((mTmpClickId) != (com.oushangfeng.pinnedsectionitemdecoration.callback.OnItemTouchListener.HEADER_ID))) {
            mHeaderClickListener.onHeaderDoubleClick(mTmpClickId, mPosition, mClickHeaderInfo);
        }
    }
    mGestureDetector.setIsLongpressEnabled(false);
    return mIntercept;
}