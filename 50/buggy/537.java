public void run() {
    if ((imageTimer.getValue()) < 10)
        frameEnd(true);
    
    if (isPlay) {
        imageTimer.resume();
    }else
        imageTimer.pause();
    
}