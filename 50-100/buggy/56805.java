@java.lang.Override
public void handleMessage(android.os.Message message) {
    android.util.Log.d(com.github.xzwj87.todolist.alarm.ui.activity.AlarmAlertActivity.ServiceThread.LOG_TAG, (("message: " + (message.obj)) + " is handled"));
    switch (message.what) {
        case com.github.xzwj87.todolist.alarm.ui.activity.AlarmAlertActivity.EVENT_USER_CLICK_OK :
        case com.github.xzwj87.todolist.alarm.ui.activity.AlarmAlertActivity.EVENT_USER_CLICK_CANCEL :
        case com.github.xzwj87.todolist.alarm.ui.activity.AlarmAlertActivity.EVENT_USER_SHAKE :
            updateAlarmState();
            break;
        case com.github.xzwj87.todolist.alarm.ui.activity.AlarmAlertActivity.EVENT_USER_ALARM_TIME_UP :
            sendNotification();
            break;
    }
    stopServices();
    finish();
}