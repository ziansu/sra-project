@java.lang.Override
public void onResume() {
    super.onResume();
    if (!(isReceiverRegistered)) {
        android.content.IntentFilter filter = new android.content.IntentFilter();
        filter.addAction(Constants.UI_ENABLE_BROADCAST_INTENT);
        filter.addAction(Constants.UI_DISABLE_BROADCAST_INTENT);
        filter.addCategory(Intent.CATEGORY_DEFAULT);
        registerReceiver(timerReceiver, filter);
        isReceiverRegistered = true;
        if (com.sparq.application.SPARQApplication.isTimerElapsed()) {
            newEvent.setEnabled(true);
        }else {
            newEvent.setEnabled(false);
        }
    }
}