@java.lang.Override
public void onBackPressed() {
    android.support.v4.app.Fragment fragment = getFragmentContentModule().getFragment();
    if ((fragment != null) && (fragment instanceof com.raxdenstudios.app.activity.OnBackActivityListener)) {
        if (((com.raxdenstudios.app.activity.OnBackActivityListener) (fragment)).onBackPressed()) {
            return ;
        }
    }
}