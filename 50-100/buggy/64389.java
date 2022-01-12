@java.lang.Override
public void finish() {
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    android.support.v4.app.Fragment fragment = fm.findFragmentByTag(StoryFragment.TAG);
    if ((fm != null) && (fragment != null)) {
        fm.beginTransaction().remove(fragment).commitAllowingStateLoss();
    }
    if ((mActionBarToolbar) != null) {
        mActionBarToolbar.getBackground().setAlpha(255);
    }
    super.finish();
}