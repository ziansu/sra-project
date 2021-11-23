private void changeNotificationTime(java.lang.String notificationTime) {
    saveTime(mNotificationTime);
    if (notificationTime.equals(getString(R.string.morning))) {
        mAlarm.cancel();
        mAlarm.setAlarm(9);
    }else
        if (notificationTime.equals(getString(R.string.evening))) {
            mAlarm.cancel();
            mAlarm.setAlarm(21);
        }else {
            mAlarm.cancel();
        }
    
}