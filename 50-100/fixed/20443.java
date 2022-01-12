@java.lang.Override
public void onAnimationEnded(int val) {
    android.util.Log.d(com.freelance.jptalusan.algeops.Activities.AddActivity.TAG, ((("val/count1: " + val) + "/") + ((countOne) - 1)));
    if (val == ((countOne) - 1)) {
        hasStartedAnimation1 = false;
    }
    if ((!(hasStartedAnimation1)) && (!(hasStartedAnimationX))) {
        answerIsCorrect();
    }
}