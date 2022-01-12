@java.lang.Override
public void onProgramRefreshed(int count) {
    mSwipeLayout.setRefreshing(false);
    if ((mMenuItemRefresh) != null)
        mMenuItemRefresh.setEnabled(true);
    
    if (count != (-1)) {
        java.lang.String msg = java.lang.String.format(getString(R.string.load_success), count);
        de.micmun.android.miwotreff.util.CustomToast.makeText(context, msg, CustomToast.TYPE_INFO).show();
    }
}