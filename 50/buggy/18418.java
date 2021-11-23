@java.lang.Override
public void unregisterViews() {
    if (expired) {
        com.appnexus.opensdk.utils.Clog.d(Clog.mediationLogTag, "This NativeAdResponse has expired.");
    }
    if ((adView) != null) {
        adView.setNativeAd(null);
        adView = null;
    }
    destroy();
}