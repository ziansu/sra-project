@android.annotation.SuppressLint(value = "SetTextI18n")
@java.lang.Override
public void run() {
    if (((!(isAdded())) || ((getActivity()) == null)) || (mIsRecording))
        return ;
    
    mDelayCurrentSecond -= 1;
    mDelayStartCountdown.setText(java.lang.Integer.toString(mDelayCurrentSecond));
    if ((mDelayCurrentSecond) == 0) {
        mDelayStartCountdown.setVisibility(View.GONE);
        mButtonVideo.setEnabled(true);
        mIsRecording = startRecordingVideo();
        mDelayHandler = null;
        return ;
    }
    mDelayHandler.postDelayed(this, 1000);
}