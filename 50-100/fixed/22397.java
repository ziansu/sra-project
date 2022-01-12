private void updatePlayingPlayerText(java.lang.String name) {
    android.widget.TextView playerTurnText = ((android.widget.TextView) (getView().findViewById(R.id.player_turn_text_view)));
    playerTurnText.setText((name + (getResources().getString(R.string.player_turn))));
    mStartingPlayerName = name;
}