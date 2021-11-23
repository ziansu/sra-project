@java.lang.Override
public int onStartCommand(com.github.javaperson.image.Intent intent, int flags, int startId) {
    if (intent != null) {
        java.lang.String action = intent.getAction();
        android.util.Log.v("onStartCommand", action);
        if (com.github.javaperson.image.ImageWidget.ACTION_UPDATE.equals(action)) {
            update();
        }
    }
    return super.onStartCommand(intent, flags, startId);
}