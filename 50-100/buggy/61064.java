private void initialize() {
    com.project.coursera.dailyselfie.PhotoListFragment listFragment;
    listFragment = new com.project.coursera.dailyselfie.PhotoListFragment();
    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
    fragmentTransaction.add(R.id.container, listFragment);
    fragmentTransaction.addToBackStack(null);
    fragmentTransaction.commit();
}