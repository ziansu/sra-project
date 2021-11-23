public static void recordAck(android.content.Context context, int transactionId) {
    android.content.SharedPreferences storage = ca.joshuatacoma.bluesky.PebbleState.getSharedPreferences(context);
    android.util.Log.i(ca.joshuatacoma.bluesky.PebbleState.TAG, "received ACK from Pebble");
    android.content.SharedPreferences.Editor editor = storage.edit();
    if ((storage.getInt("agenda.transaction", 0)) == transactionId) {
        editor.putLong("agenda.ack_time", new java.util.Date().getTime());
        editor.putInt("agenda.nack_count", 0);
    }
    editor.putInt("agenda.transaction", 0);
    editor.apply();
}