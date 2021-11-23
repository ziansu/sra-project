@java.lang.Override
public void onNext(java.lang.Long aLong) {
    exerciseTimerTracked -= 1;
    view.onRestTimerTick(exerciseTimerTracked);
}