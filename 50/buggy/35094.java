public void setNumberOfCorrectAnswers(int numberOfCorrectAnswers) {
    this.numberOfCorrectAnswers = numberOfCorrectAnswers;
    scoreLabel.setText(((java.lang.Integer.toString(this.numberOfCorrectAnswers)) + "/10"));
}