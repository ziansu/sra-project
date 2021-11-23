public void StopRecordMedia() {
    if ((phoneDeviceCamera) != null) {
        phoneDeviceCamera.stopPreview();
        phoneDeviceCamera.lock();
    }
    if ((mediaRecording) == null) {
        return ;
    }
    mediaRecording.stop();
    mediaRecording.reset();
    mediaRecording.release();
    mediaRecording = null;
}