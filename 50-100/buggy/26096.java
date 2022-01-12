public void showFragment(android.support.v4.app.Fragment fragment, boolean addToBackStack) {
    android.support.v4.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.container, fragment);
    if (addToBackStack) {
        fragmentTransaction.addToBackStack(null);
    }
}