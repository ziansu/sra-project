@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    android.util.Log.e("MyBindService", "onUnBind");
    mediaPlayer.stop();
    mediaPlayer.release();
    return true;
}