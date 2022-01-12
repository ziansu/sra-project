@java.lang.Override
protected android.os.Parcelable onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putParcelable(com.cleveroad.pulltorefresh.firework.FireworkyPullToRefreshLayout.EXTRA_SUPER_STATE, super.onSaveInstanceState());
    bundle.putBoolean(com.cleveroad.pulltorefresh.firework.FireworkyPullToRefreshLayout.EXTRA_IS_REFRESHING, mIsRefreshing);
    return bundle;
}