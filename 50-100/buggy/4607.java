protected android.view.View createNewAdViewSsl(com.spotxchange.sdk.android.SpotxAdListener adListener) {
    java.lang.String appDomain = getActivity().getString(R.string.app_domain);
    com.spotxchange.sdk.android.SpotxAdSettings settings = new com.spotxchange.sdk.android.SpotxAdSettings(getChannelIdFromEditText(), appDomain, "interstitial");
    settings.setUseSecureConnection(true);
    java.lang.String sub = ((android.widget.EditText) (_layout.findViewById(R.id.subdomainText))).getText().toString();
    if (!(sub.isEmpty())) {
        settings.setSpotxSubdomain(sub);
    }
    return createNewAdView(adListener, settings);
}