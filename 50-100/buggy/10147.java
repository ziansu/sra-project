private void clearResults() {
    tvResultsWillShowIf.setVisibility((isActivity ? android.view.View.GONE : android.view.View.VISIBLE));
    tilIP.setErrorEnabled(true);
    tilIP.setError("Invalid IP");
    cvHomeAddressRange.setVisibility(View.GONE);
    cvBroadcastAddress.setVisibility(View.GONE);
    cvNetworkAddress.setVisibility(View.GONE);
}