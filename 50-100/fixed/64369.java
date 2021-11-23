public int listen() {
    int ret;
    commLock.acquire();
    ++(this.listenCount);
    while (!(inTransaction)) {
        if ((speakCount) > 0)
            speakQueue.wake();
        
        listenQueue.sleep();
    } 
    ret = msg;
    inTransaction = false;
    --(listenCount);
    if (((listenCount) > 0) && ((speakCount) > 0))
        speakQueue.wake();
    
    commLock.release();
    return ret;
}