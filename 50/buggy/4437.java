@java.lang.Override
protected void onPreExecute() {
    android.util.Log.d(finalproject.ece558.edu.pdx.ece.brailleblackjack.PlayBlackJackGameFragment.TAG, "AnimateDealerCards");
    android.transition.TransitionManager.beginDelayedTransition(group, new android.transition.Explode());
    finalproject.ece558.edu.pdx.ece.brailleblackjack.PlayBlackJackGameFragment.toggleVisibility(dealer_left_slot, dealer_right_slot);
    changeAllButtonStates(false, false, false, false);
}