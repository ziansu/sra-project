public nu.yona.server.analysis.service.UserAnonymizedSynchronizer.Lock lock(java.util.UUID userAnonymizedID) {
    try {
        synchronized(lockedUsers) {
            nu.yona.server.analysis.service.UserAnonymizedSynchronizer.LockStatus lockStatus;
            while ((lockStatus = getLockStatus(userAnonymizedID)) == (nu.yona.server.analysis.service.UserAnonymizedSynchronizer.LockStatus.LOCKED)) {
                lockedUsers.wait();
            } 
            if (lockStatus == (nu.yona.server.analysis.service.UserAnonymizedSynchronizer.LockStatus.FREE)) {
                storeLock(userAnonymizedID);
            }
            return new nu.yona.server.analysis.service.UserAnonymizedSynchronizer.Lock(userAnonymizedID, (lockStatus == (nu.yona.server.analysis.service.UserAnonymizedSynchronizer.LockStatus.FREE)));
        }
    } catch (java.lang.InterruptedException e) {
        throw nu.yona.server.exceptions.YonaException.unexpected(e);
    }
}