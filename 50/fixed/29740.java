@java.lang.Override
public void onComplete() {
    if ((view) != null) {
        view.onRestTimerTerminate(getExerciseRestVibrate(), getExerciseRestSound());
    }
}