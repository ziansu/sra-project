@org.mozilla.gecko.annotation.WrapForJNI
public org.mozilla.gecko.media.HlsVideoInfo GetVideoInfo(int trackNumber) {
    if (org.mozilla.gecko.media.GeckoHlsSampleGetter.DEBUG)
        android.util.Log.d(org.mozilla.gecko.media.GeckoHlsSampleGetter.LOGTAG, "[HasTrackType]");
    
    vInfo = new org.mozilla.gecko.media.HlsVideoInfo();
    return vInfo;
}