@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    android.util.Log.d(com.nwsuaf.musicPlayer.PlayService.SERVICE_TAG, "---------onBind");
    java.lang.String file = intent.getStringExtra("file");
    android.widget.Toast.makeText(this, file, 0).show();
    return null;
}