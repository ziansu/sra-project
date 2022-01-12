@java.lang.Override
public void onClick(android.view.View view) {
    if ((view.getId()) == (R.id.button_check_high_scores)) {
        if (scoreWillUpdate) {
            android.widget.EditText playerNameField = ((android.widget.EditText) (view.findViewById(R.id.enter_player_name)));
            java.lang.String playerName = null;
            if (playerNameField != null) {
                playerName = playerNameField.getText().toString();
            }
            mListener.onHighScoreButtonPressed(finalScore, playerName);
        }else {
            mListener.onHighScoreButtonPressed();
        }
    }
}