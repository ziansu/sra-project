@java.lang.Override
public void onCallStateChanged(int state, java.lang.String ignored) {
    if ((this.getResources().getBoolean(R.bool.config_silent_during_call)) && (state != (android.telephony.TelephonyManager.CALL_STATE_IDLE))) {
        startService(com.android.deskclock.alarms.AlarmStateManager.createStateChangeIntent(this, "AlarmService", mCurrentAlarm, AlarmInstance.MISSED_STATE));
        return ;
    }
    if ((state != (android.telephony.TelephonyManager.CALL_STATE_IDLE)) && (state != (mInitialCallState))) {
        sendBroadcast(com.android.deskclock.alarms.AlarmStateManager.createStateChangeIntent(this, "AlarmService", mCurrentAlarm, AlarmInstance.MISSED_STATE));
    }
}