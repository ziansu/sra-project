@java.lang.Override
public boolean hasNavigationBar() {
    return mOverWriteHasNavigationBar ? mHasNavigationBar : mContext.getResources().getBoolean(com.android.internal.R.bool.config_showNavigationBar);
}