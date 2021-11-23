@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    if ((mOnNavItemClickListener) != null) {
        closeDrawer();
        mOnMenuItemSelectedListener.onItemSelected(item);
    }
    return false;
}