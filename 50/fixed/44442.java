@java.lang.Override
public void onBackPressed() {
    if ((getSupportFragmentManager().getBackStackEntryCount()) > 1) {
        getSupportFragmentManager().popBackStackImmediate();
    }else {
        finish();
    }
}