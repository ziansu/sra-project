private void setFragmentOnFragmentContainer(android.support.v4.app.Fragment fragment) {
    android.support.v4.app.FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
    trans.replace(R.id.teams_layout_fragment_container, fragment);
    trans.commit();
}