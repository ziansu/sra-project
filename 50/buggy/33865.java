public synchronized void moveComplete(com.cjmalloy.stratego.Move m) {
    if ((wview) != null)
        wview.update();
    
    aimove.release();
}