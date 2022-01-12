@java.lang.Override
public long getBufferedPosition() {
    org.mozilla.gecko.media.GeckoHlsPlayer.assertTrue(((mPlayer) != null));
    long bufferedPos = java.lang.Math.max(0L, ((mPlayer.getBufferedPosition()) * 1000L));
    if (org.mozilla.gecko.media.GeckoHlsPlayer.DEBUG) {
        android.util.Log.d(org.mozilla.gecko.media.GeckoHlsPlayer.LOGTAG, (("getBufferedPosition : " + bufferedPos) + "(Us)"));
    }
    return bufferedPos;
}