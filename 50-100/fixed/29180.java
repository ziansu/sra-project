@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    co.adrianblan.cheddar.MainActivity m = ((co.adrianblan.cheddar.MainActivity) (getActivity()));
    if (m != null) {
        android.support.v7.app.ActionBar ab = m.getSupportActionBar();
        if (ab != null) {
            updateHeaderPadding(ab.isShowing());
        }
    }
    if ((loadedSubmissions) == 0) {
    }
}