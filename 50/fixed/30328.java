private void stopRecording() {
    if (((com.simplemobiletools.camera.Preview.recorder) != null) && (com.simplemobiletools.camera.Preview.isRecording)) {
        com.simplemobiletools.camera.Preview.recorder.stop();
        com.simplemobiletools.camera.Preview.recorder = null;
        com.simplemobiletools.camera.Utils.scanFile(com.simplemobiletools.camera.Preview.curVideoPath, getContext());
    }
    com.simplemobiletools.camera.Preview.isRecording = false;
}