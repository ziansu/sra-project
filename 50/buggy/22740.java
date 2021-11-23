@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    if ((getSupportFragmentManager().getBackStackEntryCount()) == 0)
        finish();
    else
        currentFragment = mapViewFragment;
    
}