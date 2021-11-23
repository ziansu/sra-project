public void displayInterstitial() {
    if ((Utils.PROPHECIES.size()) > 0) {
        if (((new java.util.Date().getTime()) - (Utils.PROPHECIES.getLast().getDate().getTime())) > (Utils.COOLDOWN_BANNER)) {
            interstitialAd.setAdListener(new com.google.android.gms.ads.AdListener() {
                @java.lang.Override
                public void onAdLoaded() {
                    interstitialAd.show();
                }

                @java.lang.Override
                public void onAdClosed() {
                    super.onAdClosed();
                }
            });
        }
    }
}