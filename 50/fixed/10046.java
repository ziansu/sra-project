public void stopRecording() {
    if (com.byteshatf.callrecorder.CallRecording.isRecording) {
        mediaRecorder.stop();
        mediaRecorder.reset();
        mediaRecorder.release();
        mediaRecorder = null;
        com.byteshatf.callrecorder.CallRecording.isRecording = false;
    }
}