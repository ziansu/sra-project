private void setSecondFragment(android.support.v4.app.Fragment fragment) {
    if ((searchView) != null) {
        searchView.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                searchView.setQuery("", true);
            }
        });
    }
    setDrawerIndicatorEnabled(false);
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right);
    transaction.replace(R.id.right_fragment_container, fragment, com.owncloud.android.ui.activity.FileDisplayActivity.TAG_SECOND_FRAGMENT);
    transaction.commit();
}