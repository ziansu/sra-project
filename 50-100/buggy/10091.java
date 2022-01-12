public void openFragment(android.support.v4.app.Fragment fragment, boolean addToBackStack) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.Fragment oldFragment = fragmentManager.findFragmentById(R.id.container);
    android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
    transaction.replace(R.id.container, fragment);
    transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    if (addToBackStack && (!(isSameFragment(oldFragment, fragment)))) {
        transaction.addToBackStack(null);
    }
    transaction.commit();
    updateViewFromFragment(fragment);
}