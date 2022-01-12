public static void stopRingtone(android.content.Context context) {
    com.example.yink.amadeus.AlarmReceiver.settings = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    if (com.example.yink.amadeus.AlarmReceiver.isPlaying) {
        com.example.yink.amadeus.AlarmReceiver.editor = com.example.yink.amadeus.AlarmReceiver.settings.edit();
        com.example.yink.amadeus.AlarmReceiver.editor.putBoolean("alarm_toggle", false);
        com.example.yink.amadeus.AlarmReceiver.editor.apply();
        com.example.yink.amadeus.AlarmReceiver.m.release();
    }
}