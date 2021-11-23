public com.app.salpo.skillzapp.base.BaseFragment getNavigationFragment() {
    com.app.salpo.skillzapp.base.BaseFragment fragmentToReturn = mNavigationFragment;
    mNavigationFragment = null;
    return fragmentToReturn;
}