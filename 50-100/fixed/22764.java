private void checkAnswer() {
    if (questionBank.checkCurrentAnswer(txtAnswer.getText().toString())) {
        (totalCorrect)++;
        lblResponse.setText(R.string.correct_answer);
        lblResponse.setTextColor(android.support.v4.content.ContextCompat.getColor(this, R.color.correct));
    }else {
        lblResponse.setText(R.string.incorrect_answer);
        lblResponse.setTextColor(android.support.v4.content.ContextCompat.getColor(this, R.color.incorrect));
    }
    (totalQuestions)++;
    btnSubmit.setEnabled(false);
}