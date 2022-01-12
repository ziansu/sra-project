@java.lang.Override
public void adReceived(com.applovin.sdk.AppLovinAd ad) {
    lastAd = ad;
    notifySuccess();
}