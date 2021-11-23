public static void stopRecording(android.media.MediaRecorder recorder) {
    if (null != recorder) {
        recorder.stop();
        recorder.reset();
        recorder.release();
        recorder = null;
    }
}