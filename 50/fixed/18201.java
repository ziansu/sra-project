private void updateScore() {
    score = (coins) * 1000;
    coinsCollected.setText(java.lang.Integer.toString(coins));
    totalScore.setText(java.lang.Integer.toString(score));
}