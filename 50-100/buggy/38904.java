@java.lang.Override
public void onTick(long millisUntilFinished) {
    _millisUntilFinished = millisUntilFinished;
    android.util.Log.d("ALEX_LABS", ("" + (_millisUntilFinished)));
    if ((_remoteClientMessenger) != null) {
        try {
            _remoteClientMessenger.send(android.os.Message.obtain(null, com.alexlabs.trackmovement.CountDownTimerService.SEND_CURRENT_MILLIS_UNTIL_FINISHED, com.alexlabs.trackmovement.TimerUtils.getMinuteFromMillisecnods(_millisUntilFinished), com.alexlabs.trackmovement.TimerUtils.getSecondsFromMillisecnods(_millisUntilFinished)));
        } catch (android.os.RemoteException e) {
            _remoteClientMessenger = null;
        }
    }
    if ((_millisUntilFinished) < 200) {
        beginRepeatingAlarm();
    }
}