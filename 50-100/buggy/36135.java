@java.lang.Override
public void onFoundDevices(final boolean didFound) {
    if (getRouterManager().shouldEnableKalturaCastButton()) {
        registerReadyEvent(new com.kaltura.playersdk.PlayerViewController.ReadyEventListener() {
            @java.lang.Override
            public void handler() {
                mWebView.setKDPAttribute("chromecast", "visible", (didFound ? "true" : "false"));
            }
        });
    }
    if ((getRouterManager().getAppListener()) != null) {
        getRouterManager().getAppListener().didDetectCastDevices(didFound);
    }
}