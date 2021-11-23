@java.lang.Override
public void onDestroy() {
    sendTimerInfo(com.sofi.knittimer.TimerService.BROADCAST_ACTION_FINISH);
    handler.removeCallbacks(sendUpdatesToUI);
    android.util.Log.i("TimerService", "onDestroy called");
    super.onDestroy();
}