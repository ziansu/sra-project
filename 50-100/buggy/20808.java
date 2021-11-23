protected void answerIsCorrect() {
    android.support.constraint.ConstraintLayout.LayoutParams newQuestionLayoutParams = ((android.support.constraint.ConstraintLayout.LayoutParams) (startButton.getLayoutParams()));
    newQuestionLayoutParams.leftToLeft = R.id.verticalFiftyPercent;
    newQuestionLayoutParams.leftMargin = 0;
    newQuestionLayoutParams.rightMargin = 0;
    startButton.setLayoutParams(newQuestionLayoutParams);
    checkButton.setVisibility(View.VISIBLE);
    hasStarted = false;
    xSeekbar.setVisibility(View.VISIBLE);
    oneSeekbar.setVisibility(View.VISIBLE);
    xSeekbarImageView.setVisibility(View.VISIBLE);
    oneSeekbarImageView.setVisibility(View.VISIBLE);
    xSeekbarImageView.setTextColor(Color.BLACK);
    oneSeekbarImageView.setTextColor(Color.BLACK);
}