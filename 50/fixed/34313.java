public void startListening() {
    restartRecognition();
    ((main.speechrecognition.audioproviders.Audible) (voiceActivityDetector)).startListening();
    startTimerSilenceTask();
}