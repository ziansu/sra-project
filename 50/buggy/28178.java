public com.danimahardhika.cafebar.CafeBar.Builder icon(@android.support.annotation.Nullable
android.graphics.Bitmap icon, boolean tintIcon) {
    mIcon = com.danimahardhika.cafebar.CafeBarUtil.toDrawable(mContext, icon);
    mTintIcon = tintIcon;
    return this;
}