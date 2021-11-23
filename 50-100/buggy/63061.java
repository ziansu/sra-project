public void actionPerformed(final java.awt.event.ActionEvent e) {
    if ((configuration.getSimTimeout()) <= 0) {
    }else
        if (mainFrame.timerIsRunning()) {
            mainFrame.restartTimer();
        }else {
            mainFrame.startTimer();
        }
    
    mainFrame.onStop();
    mainFrame.onSwap();
    mainFrame.onStart();
}