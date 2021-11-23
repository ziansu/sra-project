@java.lang.Override
public void enter() {
    android.telecom.Log.i(com.android.server.telecom.CallAudioModeStateMachine.LOG_TAG, "Audio focus entering RINGING state");
    if (mCallAudioManager.startRinging()) {
        mAudioManager.requestAudioFocusForCall(AudioManager.STREAM_RING, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
        if ((mMostRecentMode) == (android.media.AudioManager.MODE_IN_CALL)) {
            android.telecom.Log.i(com.android.server.telecom.CallAudioModeStateMachine.LOG_TAG, ("Transition from IN_CALL -> RINGTONE." + "  Resetting to NORMAL first."));
            mAudioManager.setMode(AudioManager.MODE_NORMAL);
        }
        mAudioManager.setMode(AudioManager.MODE_RINGTONE);
        mCallAudioManager.setCallAudioRouteFocusState(CallAudioRouteStateMachine.RINGING_FOCUS);
    }else {
        android.telecom.Log.i(com.android.server.telecom.CallAudioModeStateMachine.LOG_TAG, "Entering RINGING but not acquiring focus -- silent ringtone");
    }
    mCallAudioManager.stopCallWaiting();
}