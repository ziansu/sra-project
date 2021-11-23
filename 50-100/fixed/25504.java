boolean saveChallenge(long tag, long challenge) {
    java.util.concurrent.Semaphore s = challengeMutex.get(tag);
    if (s != null) {
        synchronized(this) {
            challengeMap.put(tag, challenge);
            challengeMutex.remove(tag);
        }
        s.release();
    }else {
        org.apache.zookeeper.server.quorum.AuthFastLeaderElection.LOG.error("No challenge mutex object");
    }
    return true;
}