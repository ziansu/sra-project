@java.lang.Override
public void playerOnStop() {
    callbackHandler.removeCallbacks(hidePanelRunnable);
    callbackHandler.postDelayed(hidePanelRunnable, 1000);
}