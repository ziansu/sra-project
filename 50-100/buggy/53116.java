@java.lang.Override
public void onBackPressed() {
    android.support.v4.app.Fragment fragment = getFragmentContentModule().getFragment();
    if ((fragment != null) && (fragment instanceof com.raxdenstudios.app.activity.OnBackActivityListener)) {
        if (((com.raxdenstudios.app.activity.OnBackActivityListener) (fragment)).onBackPressed()) {
            return ;
        }
    }
    if ((getSupportFragmentManager().getBackStackEntryCount()) > 0) {
        super.onBackPressed();
    }else {
        super.onBackPressed();
    }
}