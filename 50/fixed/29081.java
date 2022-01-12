@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((mCurrentFragment) != null) {
        getSupportFragmentManager().putFragment(outState, "SavedFrag", mCurrentFragment);
    }
}