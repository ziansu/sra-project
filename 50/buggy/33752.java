public static dev.ukanth.ufirewall.InterfaceDetails getCurrentCfg(android.content.Context context, boolean checkTether) {
    if ((dev.ukanth.ufirewall.InterfaceTracker.currentCfg) == null) {
        dev.ukanth.ufirewall.InterfaceTracker.currentCfg = dev.ukanth.ufirewall.InterfaceTracker.getInterfaceDetails(context, checkTether);
    }
    return dev.ukanth.ufirewall.InterfaceTracker.currentCfg;
}