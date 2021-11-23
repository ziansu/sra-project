@java.lang.Override
public void run() {
    android.util.Log.d(com.ckt.ckttodo.widgt.CircleAlarmTimerView.TAG, "TimerTask");
    handler.obtainMessage().sendToTarget();
}