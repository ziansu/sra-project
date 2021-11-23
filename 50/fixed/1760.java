@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    pendingIntent = intent.getParcelableExtra(ListPhotosPresenter.PENDING_INTENT_CODE);
    return super.onStartCommand(intent, flags, startId);
}