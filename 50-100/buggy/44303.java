private void displayAllTeamList() {
    android.app.Fragment fragment = new org.wildstang.wildrank.android.fragments.ViewQueryResultsInListFragment();
    ((org.wildstang.wildrank.android.fragments.ViewQueryResultsInListFragment) (fragment)).setCallbacks(this);
    android.os.Bundle args = new android.os.Bundle();
    args.putInt(ViewQueryResultsInListFragment.QUERY_TYPE, ViewQueryResultsInListFragment.ALL_PIT_LIST);
    fragment.setArguments(args);
    getFragmentManager().beginTransaction().add(R.id.list_container, fragment, "teamList").commitAllowingStateLoss();
}