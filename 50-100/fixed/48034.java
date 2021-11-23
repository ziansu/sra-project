@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
        java.util.List<com.shonshampain.streamrecorder.dao.Alarm> alarms = com.shonshampain.streamrecorder.db.AlarmHelper.getInstance().fetch(context);
        for (com.shonshampain.streamrecorder.dao.Alarm alarm : alarms) {
            com.shonshampain.streamrecorder.util.Utils.setAlarm(context, alarm, false);
        }
    }
}