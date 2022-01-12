private synchronized long getDuration() {
    long duration = 0L;
    if (((mPlayer) != null) && (!(isLiveStream()))) {
        duration = java.lang.Math.max(0L, ((mPlayer.getDuration()) * 1000L));
    }
    if (org.mozilla.gecko.media.GeckoHlsPlayer.DEBUG) {
        android.util.Log.d(org.mozilla.gecko.media.GeckoHlsPlayer.LOGTAG, (("getDuration : " + duration) + "(Us)"));
    }
    return duration;
}