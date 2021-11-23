private void finishTurn() {
    mInstructionsTV.setText(R.string.games_waiting_for_other_player_turn);
    finishTurn(getNextParticipantId());
    android.util.Log.i(com.levigilad.javaplay.yaniv.YanivPlayFragment.TAG, "Turn Ended");
}