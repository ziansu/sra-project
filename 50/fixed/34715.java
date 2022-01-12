private void addFragment(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.place_fragement, fragment);
    transaction.addToBackStack(null);
    transaction.commit();
}