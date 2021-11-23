@java.lang.Override
public void confirmationResult(java.lang.Boolean confirmation) {
    confirmAnswer.dismiss();
    if (currentQuestion.article.equals(answerSpinner.getSelectedItem().toString())) {
        android.widget.Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        (CURRENT_SCORE)++;
        bit.gardits1.languagetrainer.QuestionManager.setScore(CURRENT_SCORE);
        nextQuestion();
    }else {
        android.widget.Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        nextQuestion();
    }
}