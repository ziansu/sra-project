@java.lang.Override
public void onCallStateChanged(int state, java.lang.String incomingNumber) {
    switch (state) {
        case android.telephony.TelephonyManager.CALL_STATE_OFFHOOK :
        case android.telephony.TelephonyManager.CALL_STATE_RINGING :
            if ((mMediaPlayer) != null) {
                pauseMedia();
                mOnGoingCall = true;
            }
            break;
        case android.telephony.TelephonyManager.CALL_STATE_IDLE :
            if ((mMediaPlayer) != null) {
                if (mOnGoingCall) {
                    resumeMedia();
                    mOnGoingCall = false;
                }
            }
            break;
    }
}