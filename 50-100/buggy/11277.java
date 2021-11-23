@java.lang.Override
public void onClick(android.view.View v) {
    convert_time();
    java.lang.String hour = com.bitballoon.se4351_synapps.synapps.EditNotificationActivity.pad(mHour);
    java.lang.String min = com.bitballoon.se4351_synapps.synapps.EditNotificationActivity.pad(mMinute);
    print_notification(noti_input.getText().toString(), hour, min);
    showNotification(noti_input.getText().toString(), hour, min, mAMPM, date_data);
}