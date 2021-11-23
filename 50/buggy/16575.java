private void changeFragment(android.support.v4.app.Fragment destinationFragment) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.fragment_container, destinationFragment);
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.commit();
}