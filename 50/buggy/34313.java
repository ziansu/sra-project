public void startListening() {
    createGoogleRecognition();
    restartRecognition();
    ((main.speechrecognition.audioproviders.Audible) (voiceActivityDetector)).startListening();
    startTimerSilenceTask();
}