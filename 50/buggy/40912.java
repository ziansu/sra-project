@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    if ((mFragmentManager.getBackStackEntryCount()) > 0) {
        mFragmentManager.popBackStack();
    }
}