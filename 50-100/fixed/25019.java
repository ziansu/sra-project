private void showHomeView() {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    if ((fragmentManager.getBackStackEntryCount()) > 1) {
        fragmentManager.popBackStack("home", 0);
    }else {
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
        com.recipes.recipefinder.ui.views.HomeFragment fragment = new com.recipes.recipefinder.ui.views.HomeFragment();
        currentFragment = fragment;
        transaction.replace(R.id.main_view, fragment, "home");
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        transaction.addToBackStack("home");
        transaction.commit();
    }
}