private void onInterstitialActionBarDismiss() {
    final android.content.Intent intent = getIntent();
    if ((intent != null) && (intent.hasExtra(com.frostwire.android.gui.activities.BuyActivity.INTERSTITIAL_MODE))) {
        boolean dismissActivityAfterward = intent.getBooleanExtra("dismissActivityAfterward", false);
        boolean shutdownActivityAfterwards = intent.getBooleanExtra("shutdownActivityAfterwards", false);
        Offers.AdNetworkHelper.dismissAndOrShutdownIfNecessary(null, this, dismissActivityAfterward, shutdownActivityAfterwards, false, getApplication());
    }
}