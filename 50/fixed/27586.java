@java.lang.Override
public void onNext(java.lang.Long aLong) {
    if ((view) != null) {
        exerciseTimerTracked -= 1;
        view.onRestTimerTick(exerciseTimerTracked);
    }
}