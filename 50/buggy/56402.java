public final void dispose() {
    cTimer.unsubscribe(this);
    cTimer = null;
    cActive = false;
}