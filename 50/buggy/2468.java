public boolean isInAirplaneMode(android.content.Context context) {
    return (Settings.System.getInt(context.getContentResolver(), Settings.Global.AIRPLANE_MODE_ON, 0)) != 0;
}