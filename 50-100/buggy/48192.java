public static boolean canBackgroundTrack(android.content.Context c, int evalActivity) {
    if (((evalActivity == 3) || (evalActivity == 0)) || (com.adsamcik.signalcollector.Services.TrackerService.isActive))
        return false;
    
    int val = com.adsamcik.signalcollector.Setting.getPreferences(c).getInt(Setting.BACKGROUND_TRACKING, 1);
    android.util.Log.d("TAG", ((("Eval " + evalActivity) + " saved val ") + val));
    return (val != 0) && ((val == evalActivity) || (val > evalActivity));
}