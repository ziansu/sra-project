void cancelAlarm(boolean doAllowAlarmToContinue) {
    if (isOutOfRange) {
        if ((alarmDialog) != null) {
            alarmDialog.cancel();
        }
        sendBluetoothData("x");
        vibrationRepeatHandler.removeCallbacks(repeatVibration);
        vibrator.cancel();
        isOutOfRange = false;
    }
    canActivateAlarmNow = doAllowAlarmToContinue;
}