@java.lang.Override
public void showInterstitial() {
    if ((((com.rfm.extras.adapters.RFMAdmobInterstitialAdapter.rfmAdView) != null) && (com.rfm.extras.adapters.RFMAdmobInterstitialAdapter.rfmAdView.isAdAvailableToDisplay())) || ((com.rfm.extras.adapters.RFMAdmobInterstitialAdapter.rfmAdView.getAdStateRO().getCurrentState()) == (AdState.AdViewState.INTERSTITIAL_DISP))) {
        showFullScreenRFMInterstitial();
        if ((com.rfm.extras.adapters.RFMAdmobInterstitialAdapter.customEventInterstitialListener) != null) {
            com.rfm.extras.adapters.RFMAdmobInterstitialAdapter.customEventInterstitialListener.onAdOpened();
        }
    }
}