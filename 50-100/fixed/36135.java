@java.lang.Override
public void onFoundDevices(final boolean didFound) {
    if (getRouterManager().shouldEnableKalturaCastButton()) {
        setKDPAttribute("chromecast", "visible", (didFound ? "true" : "false"));
    }
    if ((getRouterManager().getAppListener()) != null) {
        getRouterManager().getAppListener().didDetectCastDevices(didFound);
    }
}