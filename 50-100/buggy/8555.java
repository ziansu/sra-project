@java.lang.Override
public void onReceive(com.home.pete.aquarium.Context context, com.home.pete.aquarium.Intent intent) {
    boolean value = intent.getBooleanExtra("ACTION", false);
    android.util.Log.d(com.home.pete.aquarium.MainActivity.TAG, "Toggling UV state");
    com.home.pete.aquarium.Intent msg = new com.home.pete.aquarium.Intent("uv-state");
    msg.putExtra("ACTION", value);
    android.support.v4.content.LocalBroadcastManager.getInstance(context).sendBroadcast(msg);
}