@java.lang.Override
public void run() {
    if ((donutProgress.getProgress()) > (level)) {
        donutProgress.setProgress(0);
    }
    donutProgress.setProgress(((donutProgress.getProgress()) + 1));
    if ((donutProgress.getProgress()) == (level)) {
        timer.cancel();
    }
}