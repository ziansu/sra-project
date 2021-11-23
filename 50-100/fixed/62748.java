@android.support.annotation.Nullable
public android.net.Uri getDiscoveryEndpoint() {
    checkConfigurationRead();
    if (((mDiscoveryEndpoint) != null) && (!(mDiscoveryUriFormatted))) {
        java.lang.String test = mDiscoveryEndpoint.toString();
        java.lang.String discoveryEndpointString = java.lang.String.format(mDiscoveryEndpoint.toString(), getTenant(), getPolicy());
        mDiscoveryEndpoint = android.net.Uri.parse(discoveryEndpointString);
    }
    return mDiscoveryEndpoint;
}