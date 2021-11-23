private void launchResultActivity() {
    android.content.Intent resultIntent = new android.content.Intent(this, com.bignerdranch.android.thirty.ResultActivity.class);
    resultIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    java.util.HashMap<java.lang.String, java.lang.Integer> scores = game.getActivePlayer().getScores();
    resultIntent.putExtra(com.bignerdranch.android.thirty.GameActivity.EXTRA_SCORE_BOARD, scores);
    startActivityForResult(resultIntent, scoreBoardResult);
}