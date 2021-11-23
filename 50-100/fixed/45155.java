private void recordNewRiderFromNfc(final java.lang.String nfcRiderText) throws java.io.IOException {
    if (android.util.Log.isLoggable(net.bbuzz.busman.ManifestActivity.TAG, Log.DEBUG)) {
        android.util.Log.d(net.bbuzz.busman.ManifestActivity.TAG, (("recordLatestRider " + (mIsAddingToManifest ? "add " : "drop ")) + nfcRiderText));
    }
    mLatestRiderFromNfc = nfcRiderText;
    final net.bbuzz.busman.ConfigureTagActivity.RiderInfo riderInfo = net.bbuzz.busman.ConfigureTagActivity.RiderInfo.getRiderInfo(nfcRiderText);
    final java.lang.String rider = (((riderInfo.name) + " [") + (riderInfo.id)) + "]";
    recordNewRider(mIsAddingToManifest, rider);
}