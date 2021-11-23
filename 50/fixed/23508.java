@java.lang.Override
public void run() {
    if (peekShown) {
        peek(view, position);
        longHoldRunnable = null;
    }
}