public void startRecorder() {
    isCountdownActive = false;
    if ((mSharedPrefs.getConnectivityType()) == 1) {
        if ((babyfon.view.activity.MainActivity.mBoundService) != null) {
            MainActivity.mBoundService.startRecording();
        }
    }else {
        if ((babyfon.view.activity.MainActivity.mAudioRecorder) == null) {
            babyfon.view.activity.MainActivity.mAudioRecorder = new babyfon.audio.AudioRecorder(mContext, babyfon.view.activity.MainActivity.mBoundService);
        }
        MainActivity.mAudioRecorder.startRecording();
    }
}