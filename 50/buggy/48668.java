@java.lang.Override
public void onBackPressed() {
    if ((answerTimer) != null)
        answerTimer.cancel();
    
    answerTimer = null;
    finish();
}