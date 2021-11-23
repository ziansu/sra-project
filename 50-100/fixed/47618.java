private void launchListFragment(int scope) {
    getSupportFragmentManager().popBackStack("detail", FragmentManager.POP_BACK_STACK_INCLUSIVE);
    android.support.v4.app.Fragment newDetail = com.dcs.shows.ListFragment.newInstance(scope, "");
    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, newDetail, "LIST_F_TAG").commit();
}