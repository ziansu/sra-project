private void initFragment(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
    transaction.add(R.id.fragment_container, fragment);
    transaction.commit();
}