@java.lang.Override
public void run() {
    if (((!(isAdded())) || ((getActivity()) == null)) || (mIsRecording))
        return ;
    
    mButtonVideo.setEnabled(true);
    mIsRecording = startRecordingVideo();
    mDelayHandler = null;
}