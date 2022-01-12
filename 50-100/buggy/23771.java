@java.lang.Override
public void onBackPressed() {
    java.lang.String currentTabTag = mTabHost.getCurrentTabTag();
    if ((mTabHost.getCurrentTabTag()) != null) {
        android.support.v4.app.Fragment currentFragment = getSupportFragmentManager().findFragmentByTag(currentTabTag);
        if (currentFragment instanceof tw.edu.ntust.et.mit.jonkermalacca.MainActivity.OnBackPressedListener) {
            ((tw.edu.ntust.et.mit.jonkermalacca.MainActivity.OnBackPressedListener) (currentFragment)).onBackPressed();
            return ;
        }
    }
    super.onBackPressed();
}