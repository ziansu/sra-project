public void loadFragment(android.app.Fragment fragment, int currentFragmentId, boolean addToBackStack) {
    this.currentFragmentId = currentFragmentId;
    android.app.FragmentManager fragmentManager = getFragmentManager();
    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().replace(R.id.content_frame, fragment);
    if (addToBackStack) {
        fragmentTransaction.addToBackStack(null);
    }
    fragmentTransaction.commit();
    navigationView.setCheckedItem(currentFragmentId);
}