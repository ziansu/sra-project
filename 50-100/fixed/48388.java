public static void e(java.lang.String tag, java.lang.String message, java.lang.Exception e) {
    if (com.airmap.airmapsdk.AirMapLog.ENABLED) {
        if (com.airmap.airmapsdk.AirMapLog.TESTING) {
            java.lang.System.out.println(((tag + ": ") + message));
        }else
            if (!(message.isEmpty())) {
                android.util.Log.e(tag, message, e);
            }
        
    }
}