private void clearResults() {
    tvResultsWillShowIf.setVisibility((isActivity ? android.view.View.GONE : android.view.View.VISIBLE));
    tilIP.setError("Invalid IP");
    tilIP.setErrorEnabled(true);
    cvHomeAddressRange.setVisibility(View.GONE);
    cvBroadcastAddress.setVisibility(View.GONE);
    cvNetworkAddress.setVisibility(View.GONE);
}