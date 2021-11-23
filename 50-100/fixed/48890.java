@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (((intent != null) && ((intent.getAction()) != null)) && (intent.getAction().equals(com.antest1.kcanotify.KcaViewButtonService.RETURN_FAIRY_ACTION))) {
        mView.setVisibility(View.VISIBLE);
    }
    notificationManager.cancel(com.antest1.kcanotify.KcaViewButtonService.FAIRY_NOTIFICATION_ID);
    android.util.Log.e("KCA-V", "onStartCommand");
    return super.onStartCommand(intent, flags, startId);
}