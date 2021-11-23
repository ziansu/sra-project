@java.lang.Override
public void playerOnStop() {
    currentActivePlayerId = -1;
    callbackHandler.removeCallbacks(hidePanelRunnable);
    callbackHandler.postDelayed(hidePanelRunnable, 1000);
}