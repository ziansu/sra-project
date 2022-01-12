private void stop(int resId, java.lang.Object... formatArgs) {
    java.lang.String message = (resId > 0) ? getString(resId, formatArgs) : null;
    if (isPlaying) {
        isPlaying = false;
        stopForeground(true);
    }
    if ((player) != null) {
        isPrepared = false;
        player.reset();
        player.release();
    }
    broadcastEvent(PlayerEvent.STOP, message);
    stopSelf();
}