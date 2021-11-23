public void hideFragment(android.support.v4.app.Fragment fragment, android.support.v4.app.Fragment fragment1) {
    if ((null != fragment) && (null != fragment1)) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.hide(fragment).hide(fragment1);
        fragmentTransaction.commit();
    }
}