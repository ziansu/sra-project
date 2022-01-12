@java.lang.Override
public void onBackPressed() {
    boolean result = false;
    java.lang.String currentTabTag = mTabHost.getCurrentTabTag();
    if ((mTabHost.getCurrentTabTag()) != null) {
        android.support.v4.app.Fragment currentFragment = getSupportFragmentManager().findFragmentByTag(currentTabTag);
        if (currentFragment instanceof tw.edu.ntust.et.mit.jonkermalacca.MainActivity.OnBackPressedListener) {
            result = ((tw.edu.ntust.et.mit.jonkermalacca.MainActivity.OnBackPressedListener) (currentFragment)).onBackPressed();
        }
    }
    if (!result) {
        super.onBackPressed();
    }
}