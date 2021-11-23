public void scheduledRecordingStarted() {
    android.util.Log.d(com.danielkim.soundrecorder.fragments.RecordFragment.TAG, "RecordFragment - scheduledRecordingStarted");
    updateUI(true);
    isRecording = true;
}