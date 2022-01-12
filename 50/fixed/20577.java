@java.lang.Override
public void onAdFailed(com.rfm.sdk.RFMAdView adView) {
    android.util.Log.d(com.rfm.extras.adapters.RFMAdmobAdapter.LOG_TAG, "RFM :onAdFailed ");
    if ((rfmAdView) != null)
        rfmAdView.setVisibility(View.GONE);
    
    if ((customEventListener) != null) {
        customEventListener.onAdFailedToLoad(222);
    }
}