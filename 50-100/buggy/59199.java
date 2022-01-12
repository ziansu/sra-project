@java.lang.Override
public void onMainPageBeerListFragmentInteraction(java.lang.String json) {
    group10.tcss450.uw.edu.challengeapp.BeerList.BeerListFragment bl = new group10.tcss450.uw.edu.challengeapp.BeerList.BeerListFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putSerializable(BeerListFragment.KEY, json);
    bl.setArguments(args);
    android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, bl).addToBackStack(null);
    transaction.commit();
    if (!(json.equals("false"))) {
        bl.setRecView(json);
    }
}