@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.support.v4.app.Fragment allTeamsFragment = season.nfl.nflseasoncalculatorapp.fragments.AllTeamsFragment.newInstance(nfl, null);
    android.support.v4.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
    transaction.addToBackStack(null);
    transaction.add(R.id.teams_fragment_holder, allTeamsFragment);
    transaction.commit();
}