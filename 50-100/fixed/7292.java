@java.lang.Override
public boolean onBackPressed() {
    int currentPos = mViewPager.getCurrentItem();
    java.lang.String tag = mSectionsPagerAdapter.getFragmentTag(currentPos);
    if (tag != null) {
        android.support.v4.app.Fragment currentFragment = getChildFragmentManager().findFragmentByTag(tag);
        if (currentFragment instanceof tw.edu.ntust.et.mit.jonkermalacca.MainActivity.OnBackPressedListener) {
            return ((tw.edu.ntust.et.mit.jonkermalacca.MainActivity.OnBackPressedListener) (currentFragment)).onBackPressed();
        }
    }
    return false;
}