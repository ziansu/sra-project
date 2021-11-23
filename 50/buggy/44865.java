private void setScore(int score_val) {
    android.widget.TextView score = ((android.widget.TextView) (findViewById(R.id.score_value)));
    score.setText(score_val);
}