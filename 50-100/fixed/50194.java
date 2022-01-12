@java.lang.Override
public synchronized long getBufferedPosition() {
    long bufferedPos = ((mPlayer) == null) ? 0L : java.lang.Math.max(0L, ((mPlayer.getBufferedPosition()) * 1000L));
    if (org.mozilla.gecko.media.GeckoHlsPlayer.DEBUG) {
        android.util.Log.d(org.mozilla.gecko.media.GeckoHlsPlayer.LOGTAG, (("getBufferedPosition : " + bufferedPos) + "(Us)"));
    }
    return bufferedPos;
}