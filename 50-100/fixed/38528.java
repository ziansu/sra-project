public void getFTToken() {
    ftTokenRecvLock.lock();
    ftTokenRecv = true;
    ftTokenRecvLock.unlock();
    ftTokenPasserThread.lock.lock();
    hasFTToken = true;
    ftTokenPasserThread.recvdFTToken.signal();
    ftTokenPasserThread.lock.unlock();
    java.lang.System.out.println("FTToken received");
}