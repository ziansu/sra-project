public static int getWearLocation(java.lang.String miBandAddress) throws java.lang.IllegalArgumentException {
    int location = 0;
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(nodomain.freeyourgadget.gadgetbridge.GBApplication.getContext());
    if ((prefs.getString(MiBandConst.PREF_MIBAND_WEARSIDE, "left")) == "right") {
        location = 1;
    }
    return location;
}