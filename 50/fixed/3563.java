private void finishTurn() {
    android.util.Log.i(com.levigilad.javaplay.yaniv.YanivPlayFragment.TAG, "Turn Ended");
    super.finishTurn(getNextParticipantId());
    mInstructionsTV.setText(R.string.games_waiting_for_other_player_turn);
}