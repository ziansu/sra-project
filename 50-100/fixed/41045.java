public void rescheduleIfRunning(geogebra.html5.gui.util.LongTouchTimer.LongTouchHandler handler, int x, int y, int delayMillis, boolean shouldCancel) {
    if (isRunning()) {
        cancel();
        if ((!shouldCancel) || (pointWithinLimit(x, y))) {
            schedule(handler, x, y, delayMillis);
        }
    }
}