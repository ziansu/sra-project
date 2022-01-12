void silenceRingers() {
    for (com.android.server.telecom.Call call : mRingingCalls) {
        call.silence();
    }
    mRinger.stopRinging();
    mRinger.stopCallWaiting();
}