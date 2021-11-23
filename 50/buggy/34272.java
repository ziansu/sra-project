public void showAssignment() {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    org.team2635.scoutnetclient.fragments.AssignmentsFragment fragment = new org.team2635.scoutnetclient.fragments.AssignmentsFragment();
    fragmentTransaction.add(R.id.assignment_container, fragment);
    fragmentTransaction.commit();
}