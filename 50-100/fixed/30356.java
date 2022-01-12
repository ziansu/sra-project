private void setFragment(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    android.support.v4.app.Fragment temp = getSupportFragmentManager().findFragmentById(R.id.fragment_container);
    if (temp != null) {
        transaction.remove(temp);
    }
    transaction.add(R.id.fragment_container, fragment);
    transaction.commit();
}