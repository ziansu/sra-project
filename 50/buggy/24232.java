void silenceRingers() {
    for (com.android.server.telecom.Call call : mRingingCalls) {
        call.silence();
    }
    mRingingCalls.clear();
    mRinger.stopRinging();
    mRinger.stopCallWaiting();
    mCallAudioModeStateMachine.sendMessageWithArgs(CallAudioModeStateMachine.NO_MORE_RINGING_CALLS, makeArgsForModeStateMachine());
}