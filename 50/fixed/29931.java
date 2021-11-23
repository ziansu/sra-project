@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    if ((mOnNavItemClickListener) != null) {
        mOnMenuItemSelectedListener.onItemSelected(item);
        closeDrawer();
    }
    return false;
}