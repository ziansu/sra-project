private void setupMediaRecorder() throws java.io.IOException {
    mMediaRecorder.setVideoSource(MediaRecorder.VideoSource.SURFACE);
    mMediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
    mMediaRecorder.setOutputFile(mVideoFileName);
    mMediaRecorder.setVideoEncodingBitRate(8000000);
    mMediaRecorder.setVideoFrameRate(30);
    mMediaRecorder.setVideoEncoder(MediaRecorder.VideoEncoder.H264);
    mMediaRecorder.setOrientationHint(mTotalRotation);
    mMediaRecorder.prepare();
}