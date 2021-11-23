public static void i(java.lang.String tag, java.lang.String message) {
    if (com.airmap.airmapsdk.AirMapLog.ENABLED) {
        if (com.airmap.airmapsdk.AirMapLog.TESTING) {
            java.lang.System.out.println(((tag + ": ") + message));
        }else
            if (!(message.isEmpty())) {
                android.util.Log.i(tag, message);
            }
        
    }
}