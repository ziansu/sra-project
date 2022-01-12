@java.lang.Override
public void onAdLoaded() {
    android.util.Log.w("AdMob", "BannerAdLoaded");
    if ((executor.shouldAutoShow()) && (!(executor.bannerVisible))) {
        executor.showAd(true, null);
    }
    executor.fireAdEvent("admob.banner.events.LOAD", data);
    executor.fireAdEvent("onReceiveAd");
}