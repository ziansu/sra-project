private void startRecording() {
    mProcessSpeexRunnable = new my.home.common.speex.ProcessSpeexRunnable(mDataQueue, this);
    mAudioRecorderRunnable = new my.home.common.speex.AudioRecorderRunnable(mDataQueue, 1.0F, this);
    new java.lang.Thread(mProcessSpeexRunnable).start();
    new java.lang.Thread(mAudioRecorderRunnable).start();
}