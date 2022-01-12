public com.danimahardhika.cafebar.CafeBar.Builder customView(@android.support.annotation.LayoutRes
int res, boolean adjustCustomView) {
    android.view.View view = android.view.View.inflate(mContext, res, null);
    return customView(view, adjustCustomView);
}