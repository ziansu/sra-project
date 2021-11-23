public static boolean isNetworkUp(android.content.Context context) {
    return dev.ukanth.ufirewall.InterfaceTracker.getInterfaceDetails(context).netEnabled;
}