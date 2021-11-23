public void run() {
    while (true) {
        java.lang.System.out.println(("Current recording state: " + (isRecordingState)));
        if (!(isRecordingState)) {
            audioRecorder.stopRecording();
            return ;
        }
    } 
}