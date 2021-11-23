private void updateScore() {
    android.widget.TextView scoreDisplay = ((android.widget.TextView) (findViewById(R.id.scoreId)));
    scoreDisplay.setText(java.lang.Integer.toString(l00lgamescommunity.movingsquares.MainActivity.getScore()));
}