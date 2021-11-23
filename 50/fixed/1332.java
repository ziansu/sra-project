public void startTimer() {
    if ((timer) != null)
        return ;
    
    timer = new java.util.Timer();
    initializeTimerTask();
    timer.schedule(timerTask, 10000, 5000);
}