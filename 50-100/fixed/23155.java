@java.lang.Override
public void onClick(android.view.View view) {
    if ((view.getId()) == (R.id.button_check_high_scores)) {
        if (scoreWillUpdate) {
            java.lang.String playerName = null;
            if ((playerNameField) != null) {
                playerName = playerNameField.getText().toString();
            }
            mListener.onHighScoreButtonPressed(finalScore, playerName);
        }else {
            mListener.onHighScoreButtonPressed();
        }
    }
}