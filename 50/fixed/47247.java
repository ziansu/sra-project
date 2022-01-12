protected void stopRecording() {
    if (((rManager) != null) && (rManager.getRecordingStatus()))
        rManager.stopRecording();
    
}