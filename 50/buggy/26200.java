@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.v(android.content.ContentValues.TAG, "ACTION_SCREEN_ON");
    android.widget.Toast.makeText(context, "Hello", Toast.LENGTH_LONG).show();
    com.ahitugrad.notifman.CustomApplication.inputData(CustomApplication.SCREEN);
}