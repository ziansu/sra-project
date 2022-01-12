public void rescheduleIfRunning(geogebra.html5.gui.util.LongTouchTimer.LongTouchHandler handler, int x, int y, int delayMillis, boolean shouldCancel) {
    if ((isRunning()) && (!(pointWithinLimit(x, y)))) {
        cancel();
        if (!shouldCancel) {
            schedule(handler, x, y, delayMillis);
        }
    }
}