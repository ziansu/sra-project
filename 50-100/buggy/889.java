@java.lang.Override
public void setPosition(org.spout.api.geo.discrete.Point p) {
    stateLock.writeLock().lock();
    try {
        x = p.getX();
        y = p.getY();
        z = p.getZ();
        posModified = true;
    } finally {
        stateLock.writeLock().unlock();
    }
}