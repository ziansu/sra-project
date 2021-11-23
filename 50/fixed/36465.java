@java.lang.Override
public void onAdReceived(com.rfm.sdk.RFMAdView adView) {
    android.util.Log.d(com.rfm.extras.adapters.RFMAdmobAdapter.LOG_TAG, "RFM :onAdReceived ");
    if ((rfmAdView) != null)
        rfmAdView.setVisibility(View.VISIBLE);
    
    if ((customEventListener) != null) {
        customEventListener.onAdLoaded(adView);
    }
}