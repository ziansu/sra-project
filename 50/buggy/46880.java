public void setOnDotStateChangedListener(com.lsxiao.library.DotView.onDotStateChangedListener onDotStateChangedListener) {
    if (onDotStateChangedListener == null) {
        if ((mOnDotStateChangedListener) == null) {
            mOnDotStateChangedListener = new com.lsxiao.library.DotView.SimpleDotStateChangedListener();
        }
    }else {
        mOnDotStateChangedListener = onDotStateChangedListener;
    }
}