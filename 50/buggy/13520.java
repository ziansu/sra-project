@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.e(com.peets.socialplay.TreasureHuntRestActivity.TAG, "OnClick buttons[0]");
    buttons[0].setText(R.string.connecting);
    participantAccount = accountArray.get(0).getAccountId();
    disableButtons();
    inviteToPlay();
}