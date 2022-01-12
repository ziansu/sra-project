@java.lang.Override
public void onClick(android.view.View view) {
    java.util.Random random = new java.util.Random();
    if (com.XeliteXirish.NetworkKeySharer.NetworkKeySharerApp.ENABLE_ADS) {
        if (interstitialAd.isLoaded()) {
            if ((random.nextInt(5)) == 0) {
                interstitialAd.show();
            }
        }
    }
    continueOnClick();
}