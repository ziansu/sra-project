@java.lang.Override
public void onClick(android.view.View view) {
    com.alphan.mcan.snoozecharity.services.AlarmRingService.startSnoozeAlarmIntent(view.getContext(), currentAlarm.getId(), snoozeDurationInMinutes);
    finish();
}