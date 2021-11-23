@java.lang.Override
public void onEnterPressed() {
    if ((answerTimer) == null)
        return ;
    
    int l = answerText.length();
    int r;
    if (l > 0) {
        java.lang.String s = answerText.getText().toString();
        r = java.lang.Integer.valueOf(s);
        onAnswer((r == (mRightAnswer)), s);
    }
}