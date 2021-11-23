@java.lang.Override
public void run() {
    if ((!(isPaused)) && ((advTsView) != null)) {
        advTsView.next();
        hlUpdt.postDelayed(this, mDuration);
    }
}