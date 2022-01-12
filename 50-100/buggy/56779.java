@java.lang.Override
public void onPageSelected(int position) {
    android.support.v4.app.Fragment fragment = ((com.example.sonic.fspotter.MyPagerAdapter) (pager.getAdapter())).getFragment(position);
    if ((position == 2) && (fragment != null)) {
        fragment.onResume();
        android.util.Log.v(com.example.sonic.fspotter.MainActivity.TAG, "hier gehts ab");
    }
}