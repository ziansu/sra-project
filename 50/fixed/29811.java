private void loadIcon(@android.support.annotation.NonNull
com.facebook.ads.NativeAd nativeAd) {
    com.mapswithme.util.UiUtils.show(mIcon);
    com.facebook.ads.NativeAd.Image icon = nativeAd.getAdIcon();
    com.facebook.ads.NativeAd.downloadAndDisplayImage(icon, mIcon);
}