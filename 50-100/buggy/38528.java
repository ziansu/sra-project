public void getFTToken() {
    java.lang.System.out.println("FTToken received");
    ftTokenRecvLock.lock();
    ftTokenRecv = true;
    ftTokenRecvLock.unlock();
    try {
        ftTokenPasserThread.lock.lock();
        hasFTToken = true;
        ftTokenPasserThread.recvdFTToken.signal();
    } finally {
        ftTokenPasserThread.lock.unlock();
    }
}