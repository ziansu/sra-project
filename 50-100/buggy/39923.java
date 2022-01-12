@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.action_add_player)) {
        dismissDialog();
        android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(TournamentDetailsFragment.TOURNAMENT_URI, mStringUri);
        bundle.putString(TournamentDetailsFragment.TOURNAMENT_NAME, mName);
        eu.chessdata.tournament.TournamentAddPlayerFragment fragment = new eu.chessdata.tournament.TournamentAddPlayerFragment();
        fragment.setArguments(bundle);
        fragment.show(fragmentManager, "TournamentAddPlayerFragment");
        return false;
    }
    return false;
}