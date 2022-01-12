private void stopRecordingVideo() {
    if ((recorder) != null) {
        android.util.Log.v(edu.au.sydney.MainActivity.TAG, "Finishing recording, calling stop and release on recorder");
        try {
            recorder.stop();
            recorder.release();
        } catch (org.bytedeco.javacv.FFmpegFrameRecorder e) {
            e.printStackTrace();
        }
    }
}