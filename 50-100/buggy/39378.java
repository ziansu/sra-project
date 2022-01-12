public void stopEcho(android.view.View view) {
    if ((!(supportRecording)) || (!(isPlaying))) {
        return ;
    }
    com.google.sample.echo.MainActivity.stopPlay();
    updateNativeAudioUI();
    com.google.sample.echo.MainActivity.deleteSLBufferQueueAudioPlayer();
    com.google.sample.echo.MainActivity.deleteAudioRecorder();
    isPlaying = false;
}