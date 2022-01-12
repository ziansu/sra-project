@java.lang.Override
protected void onPostExecute(java.lang.Integer... params) {
    player_left_slot.setImageResource(params[0]);
    player_right_slot.setImageResource(params[1]);
    android.transition.TransitionManager.beginDelayedTransition(group, new android.transition.Explode());
    finalproject.ece558.edu.pdx.ece.brailleblackjack.PlayBlackJackGameFragment.toggleVisibility(player_left_slot, player_right_slot);
}