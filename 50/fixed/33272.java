@java.lang.Override
public synchronized void sdownSlave(java.lang.String masterName, com.didapinche.commons.redis.HostAndPort hostAndPort) {
    boolean isAboutToDown = slaveHaps.remove(hostAndPort);
    if (isAboutToDown)
        removeSlavePoolPartly(hostAndPort);
    
}