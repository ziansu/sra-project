private void launchListFragment(int scope) {
    getSupportFragmentManager().popBackStack("detail", FragmentManager.POP_BACK_STACK_INCLUSIVE);
    android.util.Log.v(com.dcs.shows.MainActivity.LOG_TAG, ("launching listF with scope: " + scope));
    android.support.v4.app.Fragment newDetail = com.dcs.shows.ListFragment.newInstance(scope, "");
    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, newDetail, "LIST_F_TAG").commit();
}