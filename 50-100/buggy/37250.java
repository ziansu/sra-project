public synchronized void setLock(int accountNum, int transID, int lockType) {
    server.Lock foundLock;
    if ((foundLock = ((server.Lock) (allLocks.get(accountNum)))) == null) {
        foundLock = new server.Lock(accountNum);
        allLocks.put(accountNum, foundLock);
    }
    foundLock.acquire(transID, lockType);
}