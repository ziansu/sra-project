private long getDuration() {
    org.mozilla.gecko.media.GeckoHlsPlayer.assertTrue(((mPlayer) != null));
    if (isLiveStream()) {
        return 0L;
    }
    long duration = java.lang.Math.max(0L, ((mPlayer.getDuration()) * 1000L));
    if (org.mozilla.gecko.media.GeckoHlsPlayer.DEBUG) {
        android.util.Log.d(org.mozilla.gecko.media.GeckoHlsPlayer.LOGTAG, (("getDuration : " + duration) + "(Us)"));
    }
    return duration;
}