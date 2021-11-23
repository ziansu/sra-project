private void switchToLoginFragment() {
    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
    manager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    com.wisecityllc.cookedapp.fragments.LoginFragment loginFrag = new com.wisecityllc.cookedapp.fragments.LoginFragment();
    android.support.v4.app.FragmentTransaction trans = manager.beginTransaction();
    trans.replace(R.id.container, loginFrag, "");
    trans.commit();
    if ((mNavigationDrawerFragment) != null)
        mNavigationDrawerFragment.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
    
}