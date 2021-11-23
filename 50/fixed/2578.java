public int getCurrentPendingIntentID() {
    if ((alarmPendingList.size()) > 0) {
        return alarmPendingList.get(0).getIntExtra(mobile.dp.velocityalarmclock.AlarmCoordinator.ALARM_ID, (-1));
    }
    return -1;
}