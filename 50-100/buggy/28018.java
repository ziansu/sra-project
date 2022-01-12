@java.lang.Override
public void onRecordingError(final java.lang.String s, java.lang.Exception e) {
    android.util.Log.e("Rewind", "Error", e);
    android.os.Handler h = new android.os.Handler(getMainLooper());
    h.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
            org.greenrobot.eventbus.EventBus.getDefault().post(new icechen1.com.blackbox.messages.RecordStatusMessage(icechen1.com.blackbox.messages.RecordStatusMessage.JUST_STOPPED));
        }
    });
    stopForeground(true);
    stopSelf();
}