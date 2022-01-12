@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (lv.kasparsj.android.util.Objects.equals(intent.getAction(), getString(R.string.action_update))) {
        if (screenStateReceiver.isScreenOff()) {
            pendingUpdateReceiver.setIsPendingUpdate(true);
        }else {
            lv.kasparsj.android.dwob.model.DailyWords.getInstance().update();
        }
    }
    return super.onStartCommand(intent, flags, startId);
}