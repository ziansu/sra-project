@java.lang.Override
public void onEnterPressed() {
    if ((answerTimer) == null)
        return ;
    
    int l = answerText.length();
    if (l > 0) {
        java.lang.String s = answerText.getText().toString();
        onAnswer(s.equals(java.lang.String.valueOf(mRightAnswer)), s);
    }
}