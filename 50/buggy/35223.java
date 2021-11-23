public void displayForTeamA(int score) {
    android.widget.TextView scoreView = ((android.widget.TextView) (findViewById(R.id.team_a_score)));
    scoreView.setText(java.lang.String.valueOf(score));
}