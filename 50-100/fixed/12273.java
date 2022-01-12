private void checkAnswer(java.lang.String userEnterAnswer) {
    java.lang.String answer = myHiraganaSet[myCurrentIndex].getMyAnswer();
    int messageResId = 0;
    if (answer.equals(userEnterAnswer))
        messageResId = R.string.correct_toast;
    else
        messageResId = R.string.incorrect_toast;
    
    android.widget.Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
}