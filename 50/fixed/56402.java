public final void dispose() {
    if (cActive) {
        cTimer.unsubscribe(this);
        cTimer = null;
        cActive = false;
    }
}