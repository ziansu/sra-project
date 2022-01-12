@java.lang.Override
public void listen() {
    if ((calendar) != null) {
        switch (type) {
            case after :
            case is :
                ryey.easer.plugins.event.time.TimeSlot.mAlarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, notifySelfIntent_positive);
                break;
            case is_not :
                ryey.easer.plugins.event.time.TimeSlot.mAlarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, notifySelfIntent_negative);
                break;
        }
    }
}