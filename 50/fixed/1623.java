@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.e(com.peets.socialplay.TreasureHuntRestActivity.TAG, "buttons[1] OnClick");
    buttons[1].setText(R.string.connecting);
    participantAccount = accountArray.get(1).getAccountId();
    inviteToPlay();
}