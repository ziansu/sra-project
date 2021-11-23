@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.os.Bundle args = intent.getExtras();
    android.app.Fragment frag = new org.croudtrip.fragments.JoinTripResultsFragment();
    frag.setArguments(args);
    getSectionList().get(0).setTarget(frag);
    getSectionList().get(0).setTitle(getString(R.string.menu_my_trip));
    setFragment(frag, getString(R.string.menu_my_trip));
}