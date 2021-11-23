@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    switch (getSupportFragmentManager().getBackStackEntryCount()) {
        case 0 :
            finish();
            break;
        case 1 :
            currentFragment = mapViewFragment;
            break;
        default :
            break;
    }
}