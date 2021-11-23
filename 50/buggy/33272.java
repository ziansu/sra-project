@java.lang.Override
public void sdownSlave(java.lang.String masterName, com.didapinche.commons.redis.HostAndPort hostAndPort) {
    boolean isAboutToDown;
    synchronized(this) {
        isAboutToDown = slaveHaps.remove(hostAndPort);
    }
    if (isAboutToDown)
        removeSlavePoolPartly(hostAndPort);
    
}