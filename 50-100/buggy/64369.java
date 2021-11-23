public int listen() {
    ++(this.listenCount);
    int ret;
    commLock.acquire();
    while (!(inTransaction)) {
        if ((speakCount) > 0)
            speakQueue.wake();
        
        listenQueue.sleep();
    } 
    ret = msg;
    inTransaction = false;
    if (((listenCount) > 0) && ((speakCount) > 0))
        speakQueue.wake();
    
    commLock.release();
    --(listenCount);
    return ret;
}