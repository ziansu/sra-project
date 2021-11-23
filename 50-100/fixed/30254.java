private void checkAnswer(boolean userPressed) {
    boolean answer = mQuestionBank[mCurrentIndex].isAnswerTrue();
    int messageResId;
    if (!(mCheated[mCurrentIndex]))
        if (userPressed == answer)
            messageResId = R.string.correct_toast;
        else
            messageResId = R.string.incorrect_toast;
        
    else
        messageResId = R.string.warning_toast;
    
    android.widget.Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
}