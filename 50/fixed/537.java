public void run() {
    while (true) {
        if ((imageTimer.getValue()) == 0)
            frameEnd(true);
        
        if (isPlay) {
            imageTimer.resume();
        }else
            imageTimer.pause();
        
    } 
}