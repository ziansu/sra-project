protected void playPause(android.view.View view) {
    if (paused)
        startTimer();
    else
        stopTimer();
    
}