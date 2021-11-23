public static void switchOffSound(android.content.Context context) {
    android.widget.Toast.makeText(context, R.string.start_message, Toast.LENGTH_LONG).show();
    com.github.varepsilon.TempSwitcher.AlarmReceiver.setRingerMode(context, AudioManager.RINGER_MODE_VIBRATE);
}