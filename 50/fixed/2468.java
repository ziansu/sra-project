public boolean isInAirplaneMode(android.content.Context context) {
    if (context == null) {
        return true;
    }
    return (Settings.System.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0)) != 0;
}