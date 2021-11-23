protected void startSearch(java.lang.String query) {
    android.util.Log.d(net.mabako.steamgifts.fragments.SearchableListFragment.TAG, ("Starting Search for " + query));
    android.support.v7.app.AppCompatActivity activity = ((android.support.v7.app.AppCompatActivity) (net.mabako.steamgifts.fragments.SearchableListFragment.getActivity()));
    android.support.v4.app.FragmentManager fragmentManager = activity.getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
    transaction.replace(R.id.fragment_container, newSearchingInstance(query), CommonActivity.FRAGMENT_TAG);
    transaction.addToBackStack(net.mabako.steamgifts.fragments.SearchableListFragment.TAG);
    transaction.commit();
}