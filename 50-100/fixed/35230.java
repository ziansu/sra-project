@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    signInButton.setVisibility(View.GONE);
    signOutButton.setVisibility(View.VISIBLE);
    Games.Invitations.registerInvitationListener(mGoogleApiClient, this);
    Games.TurnBasedMultiplayer.registerMatchUpdateListener(mGoogleApiClient, this);
    if ((mCurrentMatch) != null) {
        Games.TurnBasedMultiplayer.loadMatch(mGoogleApiClient, mCurrentMatch.getMatchId()).setResultCallback(new com.eyecuelab.survivalists.MainActivity.LoadTurnBasedMatchCallback());
    }
    if (connectionHint != null) {
        mCurrentMatch = connectionHint.getParcelable(Multiplayer.EXTRA_TURN_BASED_MATCH);
    }
}