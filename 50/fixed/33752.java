public static dev.ukanth.ufirewall.InterfaceDetails getCurrentCfg(android.content.Context context) {
    if ((dev.ukanth.ufirewall.InterfaceTracker.currentCfg) == null) {
        dev.ukanth.ufirewall.InterfaceTracker.currentCfg = dev.ukanth.ufirewall.InterfaceTracker.getInterfaceDetails(context);
    }
    return dev.ukanth.ufirewall.InterfaceTracker.currentCfg;
}