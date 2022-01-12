public void StopRecordMedia() {
    if ((phoneDeviceCamera) != null) {
    }
    if ((mediaRecording) == null) {
        return ;
    }
    mediaRecording.stop();
    mediaRecording.reset();
    mediaRecording.release();
    mediaRecording = null;
}