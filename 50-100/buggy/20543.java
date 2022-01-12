protected void nextSet() {
    stop();
    if ((++(setsCurrent)) <= (setsUser)) {
        android.util.Log.d(com.simpleworkout.timer.MainActivity.TAG, ("nextSet: setsCurrent=" + (setsCurrent)));
    }else {
        android.util.Log.e(com.simpleworkout.timer.MainActivity.TAG, ("nextSetStart: setsCurrent=" + (setsCurrent)));
    }
    updateSetsDisplay();
}