@java.lang.Override
public void run() {
    if ((!(isPaused)) && ((advTsView) != null)) {
        advTsView.next();
    }
    if (!(isPaused))
        hlUpdt.postDelayed(this, mDuration);
    
}