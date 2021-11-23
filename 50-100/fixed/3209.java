public void displayScore(java.lang.Integer collectionScore, java.lang.Integer noOfQuestions) {
    score.setText((collectionScore + " %"));
    correctStatus.setText(((((collectionScore + "/") + noOfQuestions) + " ") + (i18n.GL2278())));
    int scorePercentage = 0;
    if (collectionScore != 0) {
        scorePercentage = (collectionScore / noOfQuestions) * 100;
    }
    java.lang.String progressRedialStyle = "blue-progress-" + scorePercentage;
    progressRadial.addStyleName(progressRedialStyle);
}