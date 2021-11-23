public com.danimahardhika.cafebar.CafeBar.Builder customView(@android.support.annotation.LayoutRes
int res, boolean adjustCustomView) {
    mCustomView = android.view.View.inflate(mContext, res, null);
    mAdjustCustomView = adjustCustomView;
    return this;
}