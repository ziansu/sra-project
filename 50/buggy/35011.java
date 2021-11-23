public void stopRecorder() {
    com.wlanjie.ffmpeg.FFmpeg.getInstance().endSection();
    mAudioProcessor.stopEncode();
    mVideoRenderer.stopEncoder();
    mIsRecording = false;
}