@java.lang.Override
public void onAnimationEnded(int val) {
    android.util.Log.d(com.freelance.jptalusan.algeops.Activities.AddActivity.TAG, ((("val/countX: " + val) + "/") + ((countX) - 1)));
    if (val == ((countX) - 1)) {
        hasStartedAnimationX = false;
    }
    if ((!(hasStartedAnimation1)) && (!(hasStartedAnimationX))) {
        answerIsCorrect();
    }
}