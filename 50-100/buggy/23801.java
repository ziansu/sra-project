private void startRecording() {
    if (exarabete.audioapp.PermissionHandler.checkPermissions(getActivity(), exarabete.audioapp.recording.RecorderFragment.RECORD_EXTERNAL_WRITE_PERMISSIONS)) {
        if (!(mAudioRecorder.isRecording())) {
            mAudioRecorder.startRecording();
            startPauseRecordButton.setText("Pause recording");
            stopRecordButton.setEnabled(true);
        }
    }else {
        requestRecordAndWritePermissions();
    }
}