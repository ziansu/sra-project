private void addServiceRequest() {
    java.lang.String localID = ((localSID.substring(0, 4)) + "-") + (localSID.substring(4));
    java.lang.String query = java.lang.String.format(java.util.Locale.ENGLISH, "-%s::%s", localID, SERVICE_PREFIX);
    android.net.wifi.p2p.nsd.WifiP2pUpnpServiceRequest serviceRequest = android.net.wifi.p2p.nsd.WifiP2pUpnpServiceRequest.newInstance(query);
    android.util.Log.d(TAG, ("Adding Service Request: " + query));
    addServiceRequest(serviceRequest);
}