@java.lang.Override
public void onCallEnded(com.sinch.android.rtc.calling.Call call) {
    com.sinch.android.rtc.calling.CallEndCause cause = call.getDetails().getEndCause();
    android.util.Log.d(huhx0015.interview.club.activities.CallScreenActivity.TAG, ("Call ended. Reason: " + (cause.toString())));
    mAudioPlayer.stopProgressTone();
    setVolumeControlStream(AudioManager.USE_DEFAULT_STREAM_TYPE);
    java.lang.String endMsg = "Call ended: " + (call.getDetails().toString());
    android.widget.Toast.makeText(this, endMsg, Toast.LENGTH_LONG).show();
    endCall();
}