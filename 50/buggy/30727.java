@java.lang.Override
public void didDisplayAd(com.rfm.sdk.RFMAdView arg0) {
    if (com.rfm.util.RFMLog.canLogVerbose()) {
        android.util.Log.v(com.rfm.extras.adapters.RFMAdmobInterstitialAdapter.LOG_TAG, " Into didDisplayAd ");
    }
    com.rfm.extras.adapters.RFMAdmobInterstitialAdapter.rfmAdView.displayAd();
}