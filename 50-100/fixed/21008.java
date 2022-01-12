private void addFragmentBackstackListener() {
    getSupportFragmentManager().addOnBackStackChangedListener(new android.support.v4.app.FragmentManager.OnBackStackChangedListener() {
        @java.lang.Override
        public void onBackStackChanged() {
            int count = getSupportFragmentManager().getBackStackEntryCount();
            if (count <= 2) {
                getMyActionBar().setDisplayHomeAsUpEnabled(false);
                mDrawerFragment.enableDrawerHamburger(true);
                setBackNavigationListener(false);
            }else {
                mDrawerFragment.enableDrawerHamburger(false);
                getMyActionBar().setDisplayHomeAsUpEnabled(true);
                setBackNavigationListener(true);
            }
        }
    });
}