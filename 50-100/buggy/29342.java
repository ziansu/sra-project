@java.lang.Override
public void run() {
    if ((!(com.unity3d.ads.android.properties.UnityAdsProperties.isAdsReadySent())) && ((com.unity3d.ads.android.UnityAds.getListener()) != null)) {
        com.unity3d.ads.android.UnityAdsDeviceLog.debug("Unity Ads ready.");
        com.unity3d.ads.android.UnityAds.getListener().onFetchCompleted();
        com.unity3d.ads.android.properties.UnityAdsProperties.setAdsReadySent(true);
    }
}